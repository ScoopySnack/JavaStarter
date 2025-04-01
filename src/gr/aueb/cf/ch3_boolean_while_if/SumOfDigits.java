package gr.aueb.cf.ch3_boolean_while_if;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα των ψηφίων ενός ακεραίου.
 */
public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int inputNum;
        int tempNum;
        int digit;

        System.out.println("Enter a positive integer");
        inputNum = scanner.nextInt();

        tempNum = inputNum;
        while (tempNum>0){
            digit = tempNum % 10;
            sum += digit;
            tempNum /= 10;
        }


        System.out.println("The sum of digits of " + inputNum + " is " + sum);
    }
}
