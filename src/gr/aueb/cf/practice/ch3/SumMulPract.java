package gr.aueb.cf.practice.ch3;

/**
 * Calculates the sum and mul of first 10 integers
 */
public class SumMulPract {

    public static void main(String[] args) {
        int i = 1,j =1;
        int sum = 0;
        int mul = 1;

        while (i<=10){
            sum += i; //sum = sum + i
            i++;
        }

        while (j<=10){
            mul *= i; // mul = mul * i
            j++;
        }

        System.out.println(sum);
        System.out.println(mul);
    }
}
