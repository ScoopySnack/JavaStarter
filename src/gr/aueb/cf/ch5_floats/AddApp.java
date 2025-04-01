package gr.aueb.cf.ch5_floats;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα ακεραίων με τη χρήση μεθόδων
 */
public class AddApp {

    public static void main(String[] args) {
        int a ;
        int b ;
        int sum, sub;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert 2 integers");
        a = scanner.nextInt();
        b = scanner.nextInt();

        sum = AddApp.add(a, b);
        sub = sub(a, b);

        System.out.println(sub);
        System.out.println(sum);
    }

    /**
     * Adds two integers
     * @param a the first integer
     * @param b the second integer
     * @return the sum fo two integers
     */
    public static int add(int a,int b){
//        int result = 0;
//        result = a + b;
//        return result;
        return a + b;
    }

    /**
     * Subtracts two integers
     * @param a the first integer
     * @param b the second integer
     * @return the subtraction of the two integers
     */
    public static int sub (int a, int b){
        return a - b;
    }
}
