package gr.aueb.cf.ch6_arrays.challenges;

public class LowAndHigh {

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 8;

        int[] result = getLowAndHighIndexOf(arr, key);

        if (result[0] == -1) {
            System.out.println("Key " + key + " not found in the array.");
        } else {
            System.out.println("Key " + key + " found at low index: " + result[0] + ", high index: " + result[1]);
        }
    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int low = -1, high = -1;

        // Find the low index
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                low = i;
                break;
            }
        }

        // If key is not found, return {-1, -1}
        if (low == -1) {
            return new int[]{-1, -1};
        }

        // Find the high index
        for (int i = low; i < arr.length; i++) {
            if (arr[i] == key) {
                high = i;
            } else {
                break;
            }
        }

        return new int[]{low, high};
    }
}
