package ss1_Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class hien_thi_loi_chao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của bạn : ");
        String ten = scanner.nextLine();
        System.out.println(" Hello " +ten);
    }
}
