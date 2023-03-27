package ss1_Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD : ");
        usd = sc.nextDouble();
        double quydoi = usd * vnd;
        System.out.print("Giá trị VNĐ : " + quydoi);
    }
}
