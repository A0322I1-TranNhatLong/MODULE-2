package ss17_io_binary_file.bai_tap.QuanLiSanPhamNhiPhan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProductManager {
    // Hàm để thêm sản phẩm vào tệp
    public static void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        String code = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhập các mô tả khác: ");
        String otherDescription = scanner.nextLine();
        Product product = new Product(code, name, manufacturer, price, otherDescription);
        try {
            FileWriter writer = new FileWriter("products.txt", true);
            writer.write(product.toString() + "\n");
            writer.close();
            System.out.println("Thêm sản phẩm thành công!");
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    // Hàm để hiển thị thông tin sản phẩm
    public static void displayProducts() {
        try {
            FileReader reader = new FileReader("products.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] productInfo = line.split("\\|");
                System.out.println("Mã sản phẩm: " + productInfo[0]);
                System.out.println("Tên sản phẩm: " + productInfo[1]);
                System.out.println("Hãng sản xuất: " + productInfo[2]);
                System.out.println("Giá sản phẩm: " + productInfo[3]);
                System.out.println("Mô tả khác: " + productInfo[4]);
                System.out.println();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    // Hàm để tìm kiếm sản phẩm theo mã sản phẩm
    public static void searchProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm cần tìm: ");
        String searchCode = scanner.nextLine();
        try {
            FileReader reader = new FileReader("products.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] productInfo = line.split("\\|");
                if (productInfo[0].equals(searchCode)) {
                    System.out.println("Mã sản phẩm: " + productInfo[0]);
                    System.out.println("Tên sản phẩm: " + productInfo[1]);
                    System.out.println("Hãng sản xuất: " + productInfo[2]);
                    System.out.println("Giá sản phẩm: " + productInfo[3]);
                    System.out.println("Mô tả khác: " + productInfo[4]);
                    reader.close();
                    return;
                }
            }
            reader.close();
            System.out.println("Không tìm thấy sản phẩm với mã số này.");
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    // Hàm chính để cho phép người dùng chọn các chức năng
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
