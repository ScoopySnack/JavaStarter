package gr.aueb.cf.ch3_boolean_while_if;

import java.util.Scanner;

/**
 * Βρίσκει το πρώτο αριστερά ψηφίο ενός ακεραίου
 */
public class FirstDigitFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int firstDigit = 0;

        System.out.println("Enter a positive number");
        num = scanner.nextInt();

        while (num != 0) {
            firstDigit = Math.abs(num % 10);
            num /= 10;
        }

        System.out.println("The First digit of the given number is: " + firstDigit);

    }
}
