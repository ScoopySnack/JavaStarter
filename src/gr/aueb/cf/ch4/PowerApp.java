package gr.aueb.cf.ch4;

import java.math.BigInteger;

/**
 * Calculates a^n
 */
public class PowerApp {

    public static void main(String[] args) {
        BigInteger bigResult = new BigInteger("1");
        int base = 2, power = 10, result = 1;


        for (int i = 0; i <= power; i++) {
            result *= base; //result = result * base
            bigResult = bigResult.multiply(BigInteger.valueOf(base));
        }

        System.out.println("Result: " + result);
        System.out.println("Result: " + bigResult);
    }
}
