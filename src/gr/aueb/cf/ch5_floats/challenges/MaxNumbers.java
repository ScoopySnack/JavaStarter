package gr.aueb.cf.ch5_floats.challenges;

import java.util.Scanner;

public class MaxNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;


        System.out.println("Please insert 3 integers:");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        System.out.println("The max number of the three number you gave is: " + findMax(a,b,c));

    }

    public static int findMax(int a, int b, int c){
        return Math.max(a,Math.max(b,c));
    }

}
