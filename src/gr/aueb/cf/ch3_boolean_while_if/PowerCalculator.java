package gr.aueb.cf.ch3_boolean_while_if;

import java.util.Scanner;

/**
 * calculates base^power
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
            i++;
        }

        System.out.println("Result: " + result);
    }
}
