package gr.aueb.cf.ch4;

import java.math.BigInteger;

/**
 * Calculates a^(n)
 */
public class PowerApp {

    public static void main(String[] args) {
        int base = 2;
        int power = 10;
        int result = 1;


        for (int i = 1; i <=power ; i++) {
            result *= base;
        }

        System.out.println(result);
    }
}
