package gr.aueb.cf.ch6.challenges;

/**
 * Γενική μέθοδος εύρεσης του μέγιστου ενός πίνακα
 * getMaxPosition (int[] arr, int low, int high)
 * που επιστρέφει τη θέση στον πίνακα arr του μέγιστου στοιχείου του πίνακα
 */
public class MinAndMaxArr {

    public static void main(String[] args) {
        int[] arr = {8, 2, 25, 5, 10, 6};
        int low = 0;
        int high = 5;
        int maxPosition = getMaxPosition(arr, low, high);
        System.out.println("Η θέση του μέγιστου στοιχείου είναι: " + maxPosition);
        System.out.println("Το μέγιστο στοιχείο είναι: " + arr[maxPosition]);

        int secondMin = getSecondMin(arr);

        System.out.println("Το δεύτερο ελάχιστο είναι: " + secondMin);

    }

    public static int getMaxPosition(int[] arr, int low, int high){

        if(arr == null || arr.length == 0) return -1;
        if (low < 0 || high > arr.length - 1) return -1;
        if (low > high) return -1;

        int maxPosition = low;
        int maxValue = arr[low];


        for (int i = low; i <= high; i++) {
            if (arr[i] > maxValue){
                maxPosition = i;
                maxValue = arr[i];
            }

        }

        return maxPosition;
    }

    public static int getSecondMin(int[] arr) {
        if (arr == null || arr.length < 2) return -1;

        int minPosition = getMinPosition(arr);
        int firstMinValue = arr[minPosition];

        int secondMin = Integer.MAX_VALUE;


        for (int el : arr) {
            if (el > firstMinValue && el < secondMin) {
                secondMin = el;
            }
        }

        if (secondMin == Integer.MAX_VALUE) return -1;

        return secondMin;
    }



    public static int getMinPosition(int[] arr){

        if(arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int minValue = arr[minPosition];


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue){
                minPosition = i;
                minValue = arr[i];
            }

        }

        return minPosition;
    }


}
