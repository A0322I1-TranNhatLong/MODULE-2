package ss3_array_method.bai_tap;

import java.util.Scanner;

public class SumMotCotXacDinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] matrix = new int[3][3];
        System.out.println("Nhập " + matrix.length + " hàng và " +
                matrix[0].length + " cột: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println("Nhập cột muốn tính tổng ");
        int columnSum = input.nextInt();
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            sum += matrix[i][columnSum - 1];
        }
        System.out.println("Tổng của cột "+ columnSum + " là: " + sum);
    }
}
