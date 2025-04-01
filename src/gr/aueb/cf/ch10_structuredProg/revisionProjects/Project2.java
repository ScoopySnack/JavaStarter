package gr.aueb.cf.ch10_structuredProg.revisionProjects;


/**
 * Ο στόχος είναι να εντοπιστεί το συνεχόμενο υποσύνολο στοιχείων ενός πίνακα που έχει το μέγιστο άθροισμα.
 * Η λύση πρέπει να βασιστεί στον αλγόριθμο Kadane, ο οποίος χρησιμοποιεί δυναμικό προγραμματισμό.
 */
public class Project2 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, -2, 5};
        System.out.println(maxSubarraySum(numbers));
    }

    public static int maxSubarraySum(int[] arr) {
        int res = arr[0];

        // Outer loop for starting point of subarray
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;

            // Inner loop for ending point of subarray
            for (int j = i; j < arr.length; j++) {
                currSum = currSum + arr[j];

                // Update res if currSum is greater than res
                res = Math.max(res, currSum);
            }
        }
        return res;
    }

}
