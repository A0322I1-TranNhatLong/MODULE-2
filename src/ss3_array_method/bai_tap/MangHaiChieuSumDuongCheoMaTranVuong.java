package ss3_array_method.bai_tap;

import java.util.Scanner;

public class MangHaiChieuSumDuongCheoMaTranVuong {
    public static void main(String[] args) {
        //Nhap so hang,cot hinh vuong
       Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int inputRow = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int inputCol = scanner.nextInt();
        int[][] matrix = new int[inputRow][inputCol];
        System.out.println("Nhập " + matrix.length + " hàng và " + matrix[0].length + " cột: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        int sum = matrix[0][0];
        int i;
        int j;
        // Duyệt mảng
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++) {
                if ((matrix[i].length - i) == j) {
//                    System.out.println(arr[i][j]);
                    sum += matrix[i][j];
                }
            }
        }
        System.out.print("Kết quả là: ");
        System.out.print(sum);
    }
}
