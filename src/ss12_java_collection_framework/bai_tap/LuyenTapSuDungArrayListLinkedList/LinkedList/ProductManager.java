package ss12_java_collection_framework.bai_tap.LuyenTapSuDungArrayListLinkedList.LinkedList;

import ss12_java_collection_framework.bai_tap.LuyenTapSuDungArrayListLinkedList.ArrayList.Product;

import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager {
    LinkedList<Product> list = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public void add(Product product) {
        list.add(product);
    }

    public void edit() {
        System.out.print("Nhập id Product muốn edit:");
        String id = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (id.equalsIgnoreCase(list.get(i).getIdProduct())) {
                System.out.print("Nhập id mới:");
                list.get(i).setIdProduct(scanner.nextLine());
                System.out.print("Nhập name mới:");
                list.get(i).setNameProduct(scanner.nextLine());
                System.out.print("Nhập Cost mới:");
                list.get(i).setCostProduct(Double.parseDouble(scanner.nextLine()));
                break;
            }
        }
    }

    public void remove() {
        System.out.print("Nhập id muốn xóa:");
        String id = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (id.equalsIgnoreCase(list.get(i).getIdProduct())) {
                list.remove(i);
                break;
            }
        }
    }

    public void search() {
        System.out.print("Nhập id muốn tìm:");
        String id = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdProduct().equalsIgnoreCase(id)) {
                System.out.println(list.get(i).toString());
                break;
            }
        }
    }

    public void display() {
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public void sortCost() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getCostProduct() > list.get(j).getCostProduct()) {
                    Product temp = list.set(i, list.get(i));
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
