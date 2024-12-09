package gr.aueb.cf.ch4;

import java.math.BigInteger;

/**
 * Power application with a big power.
 */
public class PowerBigInt {

    public static void main(String[] args) {
        int base = 2;
        int power = 100;
        int result = 1;
        BigInteger bigInteger = new BigInteger("1");

        for (int i = 1; i <=power ; i++) {
            result *= base;
            bigInteger = bigInteger.multiply(BigInteger.valueOf(base));
        }

        System.out.println(result);
        System.out.println(bigInteger);
    }
}
