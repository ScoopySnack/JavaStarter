package gr.aueb.cf.ch3_boolean_while_if;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα των άρτιων από το 2
 * μέχρι ένα όριο που δίνει ο χρήστης
 */
public class SumOfEvents {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum;
        int sum =0;
        int i=2;

        System.out.println("Please insert upper limit");
        inputNum = scanner.nextInt();

        while (i<= inputNum){
            sum +=i;
            i += 2;
        }

        System.out.println("The sum of even numbers up to " + inputNum + " is: " + sum);
    }
}
