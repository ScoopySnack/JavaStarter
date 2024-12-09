package gr.aueb.cf.practice.ch3;

import java.util.Scanner;

/**
 * Practice of ternary operator
 */
public class TernaryOp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, abs;

        System.out.println("Please enter a num");
        num = scanner.nextInt();

        abs = (num >= 0) ? num : -num;

        System.out.println("abs: " + abs);
    }
}
