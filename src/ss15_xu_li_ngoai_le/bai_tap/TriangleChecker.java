package ss15_xu_li_ngoai_le.bai_tap;

import ss15_xu_li_ngoai_le.bai_tap.IllegalTriangleException;

import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validTriangle = false;

        while (!validTriangle) {
            try {
                System.out.print("Nhập cạnh a : ");
                double side1 = scanner.nextDouble();

                System.out.print("Nhập cạnh b : ");
                double side2 = scanner.nextDouble();

                System.out.print("Nhập cạnh c : ");
                double side3 = scanner.nextDouble();

                if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                    throw new IllegalTriangleException("Độ dài cạnh phải là số dương ! ");
                }

                if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
                    throw new IllegalTriangleException("Tam giác không hợp lệ ! ");
                }

                System.out.println("Tam giác hợp lệ ! ");
                validTriangle = true;
            } catch (IllegalTriangleException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: Invalid input");
            } finally {
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
