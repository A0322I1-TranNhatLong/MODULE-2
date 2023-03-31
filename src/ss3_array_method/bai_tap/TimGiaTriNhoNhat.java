package ss3_array_method.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước của mảng : ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.print("Kích thước mảng không vượt quá 20");
            }
        } while (size > 20);
        // nhap gia tri mang
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
//        System.out.println(Arrays.toString(array));
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + "\t");
        }
        //Duyệt các phần tử trong mảng để tìm GTNN và vị trí
        int min = array[0];
        int index = 0;
        for (int k = 1; k < array.length; k++) {
            if (array[k] < min) {
                min = array[k];
                index = k + 1;
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng : " + min);
        System.out.println(" Vị trí của phần tử nhỏ nhất trong mảng : " + index);
    }
}
