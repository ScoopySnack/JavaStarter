package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβανει input από τον χρήστη έναν διψήφιο ακέραιο και να
 * εκτυπώνει το άθροισμα των ψηφίων του
 */
public class DigitsSum {

    public static void main(String[] args) {
        int inputNum;
        int leftD;
        int rightD;
        int sum;

        Scanner in = new Scanner(System.in);

        System.out.println("Give me a 2-digit number");
        inputNum = in.nextInt();

        leftD = inputNum / 10; // με div 10 παιρνουμε ρο αριστερο ψηφίο
        rightD = inputNum % 10; // με mod 10  παιρνουμε το δεξι

        sum= leftD + rightD;

        System.out.printf("Input num: %d, Left digit: %d, Right digit: %d, Sum: %d", inputNum, leftD, rightD, sum);


    }
}
