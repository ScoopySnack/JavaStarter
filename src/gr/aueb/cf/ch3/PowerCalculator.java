package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * calculates b^power
 */
public class PowerCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base;
        int power;
        int i=1;
        int result =1;

        System.out.println("Insert base and power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while(i<=power){
            result *= base;
            i++;}
    }
}
