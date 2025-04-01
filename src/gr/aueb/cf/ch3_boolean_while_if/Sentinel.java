package gr.aueb.cf.ch3_boolean_while_if;

import java.util.Scanner;

/**
 * Calculate the positives' count
 */
public class Sentinel {

    public static void main(String[] args) {
        int positivesCount = 0;
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please insert a num");
        inputNum = in.nextInt();

        while (inputNum >= 0) {
            positivesCount++;
            System.out.println("Please insert a num");
            inputNum = in.nextInt();
        }

        System.out.println("Positives count: " + positivesCount);
    }
}
