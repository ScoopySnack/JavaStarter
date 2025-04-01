package gr.aueb.cf.ch3_boolean_while_if;

import java.util.Scanner;

public class NumDenominator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
                System.out.println("Insert a numerator");
                numerator = scanner.nextInt();

                if (numerator == 0) {
                    System.out.println("Number is zero. Quiting....");
                    break;
                }
                System.out.println("Please insert denominator");
                denominator = scanner.nextInt();

                if (denominator == 0) {
                    System.out.println("Denominator must not be zero.Try again.");
                    continue;
                }
                result = numerator / denominator;
                System.out.println("Result: " + result);

        }
    }
}
