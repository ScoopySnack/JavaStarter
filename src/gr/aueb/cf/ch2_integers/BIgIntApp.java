package gr.aueb.cf.ch2_integers;

import java.math.BigInteger;

/**
 * BigInteger class demo
 */

public class BIgIntApp {
    public static void main(String[] args) {


    //    Declarations
    BigInteger bigNum1 = new BigInteger("54652695952548");
    BigInteger bigNum2 = new BigInteger("55145874563258456");
    BigInteger result3;

    result3 = bigNum1.add(bigNum2);
    System.out.printf("%d", result3);


    }

}
