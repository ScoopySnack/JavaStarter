package gr.aueb.cf.ch5.challenges;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double inputC;

        System.out.println("Please insert a temperature in C:");
        inputC = in.nextDouble();

        System.out.printf("%.2f Celsius is %.2f Fahrenheit", inputC, toFahrenheit(inputC));

    }

    public static double toFahrenheit(double celsius){
        return (celsius * 9)/5 + 32;
    }


}
