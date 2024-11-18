package gr.aueb.cf.practice.ch3;

import java.util.Scanner;

/**
 * Calculates the positives count.
 * The program is continuously executed until a negative number is given.
 */
public class Sentinel {

    public static void main(String[] args) {
        int positivesCount = 0;
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please insert a num");
        inputNum = scanner.nextInt();

        while (inputNum >= 0){ //This is the sentinel(ο φρουρός για το πόσες φορές θα εκτελεστεί ο βρόγχος)
            positivesCount++;
            System.out.println("Please insert a num");
            inputNum = scanner.nextInt();
        }

        System.out.println("Positives count:" + positivesCount);
    }
}
