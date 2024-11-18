package gr.aueb.cf.practice.ch3;

import java.util.Scanner;

/**
 * Calculates (n!).
 *Σε περίπτωση μεγάλων αριθμών θα έχω overflow.
 */
public class ParagontikoFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int facto = 1;
        int i = 1;

        System.out.println("Please insert input num");
        inputNum = scanner.nextInt();

        while (i <= inputNum){
            facto *= i;
            i++;

        }

        System.out.println("Factorial: " + facto);
    }
}
