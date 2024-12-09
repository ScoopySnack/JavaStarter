package gr.aueb.cf.ch6;

/**
 * Δήλωση και αρχικοποίηση ενός πίνακα.
 * populate ένα πίνακα
 * -new
 * -used init
 * -array initializer
 * -print τα στοιχεία του πίνακα
 */

public class ArrayInit {

    public static void main(String[] args) {
        int [] arr = new int[3]; //declare init
        int [] arr2 = { 1, 2 , 3, 4, 5}; //unsized initializer
        int [] arr3;
        arr3 = new int[] {1, 2, 3 , 4, 5}; //array initializer

        //Populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        //traverse(διάσχιση)
        for (int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        //print with enhanced for:
        for (int el : arr3){
            System.out.print(el + " ");
        }
    }
}
