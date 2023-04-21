package ss11_dsa_stack_queue.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập dãy cần kiểm tra:");
        String string = scanner.nextLine();
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        String test = string.toLowerCase();
        for (int i = 0; i < test.length(); i++) {
            char temp = test.charAt(i);
            stack.push(String.valueOf(temp));
            queue.add(String.valueOf(temp));
        }
//        String reverseString = "";
//        while (!stack.isEmpty()) {
//            reverseString = reverseString + stack.pop();
//        }
//        if (string.equals(reverseString))
//            System.out.println("Đây là Palindrome");
//        else
//            System.out.println("Đây không phải là Palindrome");
        int sizeTest = stack.size();
        int count = 0;
        while (!stack.isEmpty()) {
            if (stack.pop().equals(queue.remove()) == true) {
                count++;
            }
        }
        if (count == sizeTest) {
            System.out.printf("Đây là Palindrome ");
        } else
            System.out.printf("Đây không phải là Palindrome");
    }
}
