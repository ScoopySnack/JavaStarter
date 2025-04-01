package gr.aueb.cf.ch2_integers;

/**
 * Expressions demo
 */
public class ExpessionApp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 =0;
        int result2 = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;

        num1++;
        num1 = num1 + 1;
        num1 +=1;

        --num2;

        result1 = num1++; // if num1 = 8, result = 8, num1=9
        result2 = ++num2; // if num2 = 8, result = 9, num2 = 9 Πρώτα αυξάνεται η τιμή και μετα εκχωρείται η τιμή

        result1 = result1 * 12;
        result1 *= 12;


    }
}
