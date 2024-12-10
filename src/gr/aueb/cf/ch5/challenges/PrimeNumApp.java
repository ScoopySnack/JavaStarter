package gr.aueb.cf.ch5.challenges;

import java.util.Scanner;

public class PrimeNumApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("Please insert a number:");
        num = in.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is prime");
        }
        else {
            System.out.println(num + " is not prime");
        }
    }

    public static boolean isPrime(int num){
        // Corner case
        if (num <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;

        return true;
    }
}
