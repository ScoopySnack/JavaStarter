package gr.aueb.cf.ch4;

/**
 * Calculates sum and mul of the first 10 integers.
 */
public class ForSumMulApp {

    public static void main(String[] args) {
        int sum =0, mul =1;

        for (int i = 1; i <10 ; i++) {
            sum += i;
            mul *= i;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Mul:" + mul);
    }
}