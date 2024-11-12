package gr.aueb.cf.ch4;

import java.math.BigInteger;

/**
 * Calculates a^n
 */
public class PowerApp {

    public static void main(String[] args) {
        int base = 2, power = 10, result = 1;


        for (int i = 0; i <= power; i++) {
            result *= base; //result = result * base
        }

        System.out.println("Result: " + result);
    }
}
