package gr.aueb.cf.ch5_floats;

/**
 * Υπολογίζει το !n.
 */
public class Factorial {

    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i + "! =" + facto(i));
        }
    }

    /**
     * Calculates n!
     * @param n the input number
     * @return  the factorial of n
     */
    public static int facto(int n){
        int result = 1;

        for (int i = 1; i <=n ; i++) {
            result *= i;
        }

        return result;
    }
}
