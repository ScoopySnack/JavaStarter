package gr.aueb.cf.ch5.challenges;

import java.util.Scanner;

public class FahrenheitToCelsiusWithMethod {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputF;

        System.out.println("Please insert a temperature in F:");
        inputF = in.nextInt();

        System.out.printf("%d Fahrenheit is %d Celsius", inputF, toCelsius(inputF));

    }

    public static int toCelsius(int fahrenheit){
        return 5 * (fahrenheit - 32)/9;
    }

}
