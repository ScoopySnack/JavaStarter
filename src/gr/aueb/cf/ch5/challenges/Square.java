package gr.aueb.cf.ch5.challenges;

import java.util.Scanner;

/**
 * Δέχεται έναν ακέραιο αριθμό ως παράμετρο και να επιστρέφει το τετράγωνό του.
 * Δηλαδή, αν η είσοδος είναι το 5, η μέθοδος να επιστρέφει το 25
 */
public class Square {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("Please insert a number:");
        num = in.nextInt();

        System.out.printf("the square of %d is %d",num, sqr(num));
    }

    public static int sqr(int num){
        return num * num;
    }
}
