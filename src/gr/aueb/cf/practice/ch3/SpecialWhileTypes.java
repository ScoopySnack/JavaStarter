package gr.aueb.cf.practice.ch3;

import java.util.Scanner;

/**
 * Special forms of while.
 */
public class SpecialWhileTypes {

    public static void main(String[] args) {
        int i =1;
        Scanner scanner = new Scanner(System.in);
        int num;

        while ((num = scanner.nextInt()) >= 0); //Καταναλώνει θετικούς αριθμούς. Στον 1ο αρνητικό η επανάληψη σταματάει

        while (i<=0){ //ZERO ITERATIONS
            System.out.println("Never gets in");
            i++;
        }

        while (i<1){ //ZERO ITERATIONS
            System.out.println("Never gets in");
            i++;
        }

        while (i <= 1){ //ONE TIME ITERATION!
            System.out.println("One time gets in");
            i++;
        }

        while (true){//ETERNAL LOOP
            System.out.println("Always gets in");
            i++;
        }


    }
}
