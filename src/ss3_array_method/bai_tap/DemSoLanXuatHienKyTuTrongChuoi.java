package ss3_array_method.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // tao 1 chuoi
        System.out.print("Mời bạn nhập một chuỗi bất kỳ : ");
        String str = scanner.nextLine();
        System.out.println(str);
        System.out.print("Nhập từ bàn phím một ký tự : ");
        char character = scanner.nextLine().charAt(0);
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(character == str.charAt(i)){
                count ++;
            }
        }
        System.out.println("Số lần xuất hiện của kí tự " + character + " trong chuỗi " + str + " là : " + count);
    }
}
