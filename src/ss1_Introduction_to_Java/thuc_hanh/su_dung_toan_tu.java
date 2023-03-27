package ss1_Introduction_to_Java.thuc_hanh;

import java.util.Scanner;

public class su_dung_toan_tu {
    public static void main(String[] args) {
        float chieudai;
        float chieurong;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài : ");
        chieudai = scanner.nextFloat();
        System.out.print("Nhập chiều rộng : ");
        chieurong = scanner.nextFloat();
        float dientich = chieudai * chieurong;
        while (chieudai<chieurong|| chieudai<0||chieurong<0){
            System.out.println("Sai điều kiện , mời bạn nhập lại ! " );
            System.out.print("Nhập chiều dài : ");
            chieudai = scanner.nextFloat();
            System.out.print("Nhập chiều rộng : ");
            chieurong = scanner.nextFloat();
        }
        System.out.println("Diện tích : " +dientich);
    }
}
