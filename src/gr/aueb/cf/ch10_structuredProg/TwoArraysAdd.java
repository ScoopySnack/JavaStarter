package gr.aueb.cf.ch10_structuredProg;

/**
 * Adding two integers stored in two arrays with the same length.
 */
public class TwoArraysAdd {

    public static void main(String[] args) {
        int[] arr1 = {1,8,8,8};
        int[] arr2 = {2,0,1,3};
        int[] arrOut;

        arrOut = addLargeIntegers(arr1,arr2);
        for (int digit : arrOut){
            System.out.print(digit + " ");
        }
    }

    public static int[] addLargeIntegers(int[] arr1, int[] arr2){
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] arrOut= new int[maxLength + 1];
        int carry = 0;
        int currentSum;


        for (int i = maxLength - 1; i >= 0; i-- ){
            currentSum = arr1[i] + arr2[i] + carry;
            arrOut[i + 1] = currentSum % 10;
            carry = currentSum / 10;
        }


        arrOut[0] = carry;
        return arrOut;
    }
}
