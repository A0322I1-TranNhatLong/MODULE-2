package ss12_java_collection_framework.bai_tap.LuyenTapSuDungArrayListLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Index {
    public static class ProductManager {
        ArrayList<Product> productList = new ArrayList<Product>();
        Scanner scan = new Scanner(System.in);
        public static void main (String []args){
            ProductManager productManager = new ProductManager();

            while (true) {
                System.out.println("---------------------------------------------");
                System.out.println("1. Thêm sản phẩm");
                System.out.println("2. Sửa thông tin sản phẩm theo id");
                System.out.println("3. Xoá sản phẩm theo id");
                System.out.println("4. Hiển thị danh sách sản phẩm");
                System.out.println("5. Tìm kiếm sản phẩm theo tên");
                System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
                System.out.println("7. Thoát chương trình");
                System.out.println("---------------------------------------------");

                int choice = productManager.scan.nextInt();
                productManager.scan.nextLine();

                switch (choice) {
                    case 1:
                        productManager.addProduct();
                        break;
                    case 2:
                        productManager.editProduct();
                        break;
                    case 3:
                        productManager.deleteProduct();
                        break;
                    case 4:
                        productManager.showProductList();
                        break;
                    case 5:
                        productManager.searchProduct();
                        break;
                    case 6:
                        productManager.sortProduct();
                        break;
                    case 7:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ!");
                        break;
                }
            }
        }

        // thêm sản phẩm
        public void addProduct() {
            System.out.println("Nhập tên sản phẩm: ");
            String name = scan.nextLine();

            System.out.println("Nhập giá sản phẩm: ");
            double price = scan.nextDouble();

            Product product = new Product(name, price);

            productList.add(product);

            System.out.println("Đã thêm sản phẩm thành công!");
        }

        // sửa thông tin sản phẩm
        public void editProduct() {
            System.out.println("Nhập id sản phẩm cần sửa: ");
            int id = scan.nextInt();

            if (id >= 1 && id <= productList.size()) {
                System.out.println("Nhập tên mới cho sản phẩm: ");
                String newName = scan.nextLine();

                System.out.println("Nhập giá mới cho sản phẩm: ");
                double newPrice = scan.nextDouble();

                productList.get(id-1).setName(newName);
                productList.get(id-1).setPrice(newPrice);

                System.out.println("Đã sửa thông tin sản phẩm thành công!");
            } else {
                System.out.println("Không tìm thấy sản phẩm có id: " + id);
            }
        }

        // xoá sản phẩm
        public void deleteProduct() {
            System.out.println("Nhập id sản phẩm cần xoá: ");
            int id = scan.nextInt();

            if (id >= 1 && id <= productList.size()) {
                productList.remove(id-1);

                System.out.println("Đã xoá sản phẩm thành công!");
            } else {
                System.out.println("Không tìm thấy sản phẩm có id: " + id);
            }
        }

        // hiển thị danh sách sản phẩm
        public void showProductList() {
            if (productList.size() == 0) {
                System.out.println("Danh sách sản phẩm đang trống!");
            } else {
                System.out.println("Danh sách sản phẩm:");
                System.out.println("Id   Tên sản phẩm     Giá sản phẩm");

                for (int i = 0; i < productList.size(); i++) {
                    System.out.println((i+1) + "     " + productList.get(i).getName() + "     " + productList.get(i).getPrice());
                }
            }
        }

        // tìm kiếm sản phẩm
        public void searchProduct() {
            System.out.println("Nhập tên sản phẩm cần tìm: ");
            String name = scan.nextLine();

            ArrayList<Product> foundList = new ArrayList<Product>();

            for (Product p : productList) {
                if (p.getName().equalsIgnoreCase(name)) {
                    foundList.add(p);
                }
            }

            if (foundList.size() == 0) {
                System.out.println("Không tìm thấy sản phẩm tên: " + name);
            } else {
                System.out.println("Sản phẩm tên " + name + " được tìm thấy:");
                System.out.println("Id     Tên sản phẩm        Giá sản phẩm");

                for (int i = 0; i < foundList.size(); i++) {
                    System.out.println((i+1) + "     " + foundList.get(i).getName() + "     " + foundList.get(i).getPrice());
                }
            }
        }

        // sắp xếp sản phẩm
        public void sortProduct() {
            System.out.println("1. Sắp xếp tăng dần theo giá.");
            System.out.println("2. Sắp xếp giảm dần theo giá.");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    Collections.sort(productList, new Comparator<Product>() {
                        @Override
                        public int compare(Product p1, Product p2) {
                            return Double.compare(p1.getPrice(), p2.getPrice());
                        }
                    });

                    System.out.println("Đã sắp xếp sản phẩm theo thứ tự tăng dần theo giá.");
                    break;
                case 2:
                    Collections.sort(productList, new Comparator<Product>() {
                        @Override
                        public int compare(Product p1, Product p2) {
                            return Double.compare(p2.getPrice(), p1.getPrice());
                        }
                    });

                    System.out.println("Đã sắp xếp sản phẩm theo thứ tự giảm dần theo giá.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        }
    }

    // class sản phẩm
    static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }
}
