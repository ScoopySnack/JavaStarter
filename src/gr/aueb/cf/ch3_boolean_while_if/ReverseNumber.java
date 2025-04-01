package gr.aueb.cf.ch3_boolean_while_if;

import java.util.Scanner;

/**
 * Reverses an integer number
 */
public class ReverseNumber {

    public static void main(String[] args) {
        Scanner scanner =   new Scanner(System.in);
        int num = 0;
        int reversed = 0;
        int tempNum = 0;
        int rightDigit = 0;


        System.out.println("Please enter a number");
        num = scanner.nextInt();

        tempNum = num;
        while (tempNum > 0){
            rightDigit = tempNum % 10;
            reversed = reversed * 10 + rightDigit;
            tempNum /= 10;

        }

        System.out.println("The reversed number is: " + reversed);
    }
}
