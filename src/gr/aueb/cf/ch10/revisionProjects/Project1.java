package gr.aueb.cf.ch10.revisionProjects;

import java.io.*;
import java.util.Arrays;

/**
 * Διαβάζει από ένα αρχείο ακέραιους αριθμούς
 * (το αρχείο πρέπει να περιέχει περισσότερους από 6 αριθμούς και το πολύ 49 αριθμούς) με τιμές από 1 έως 49.
 * Τους αριθμούς αυτούς τους εισάγει σε ένα πίνακα, τον οποίο ταξινομεί (π.χ. με την Arrays.sort()).
 * Στη συνέχεια, το πρόγραμμα παράγει όλες τις δυνατές εξάδες (συνδυασμούς 6 αριθμών).
 * Ταυτόχρονα και αμέσως μετά την παραγωγή κάθε εξάδας ‘φιλτράρει’ κάθε εξάδα ώστε να πληροί τα παρακάτω κριτήρια:
 * 1) Να περιέχει το πολύ 4 άρτιους,
 * 2) να περιέχει το πολύ 4 περιττούς,
 * 3) να περιέχει το πολύ 2 συνεχόμενους,
 * 4) να περιέχει το πολύ 3 ίδιους λήγοντες,
 * 5) να περιέχει το πολύ 3 αριθμούς στην ίδια δεκάδα.
 * Τέλος, εκτυπώνει τις τελικές εξάδες σε ένα αρχείο με όνομα της επιλογής σας και κατάληξη.txt.
 */
public class Project1 {

    public static void main(String[] args) {
        File inFd = new File("C:/tmp/numbers.txt");
        File outFd = new File("C:/tmp/numbers-out.txt");

        try {

            int[] numbers = readFile(inFd);
            Arrays.sort(numbers);

            generateCombinations(numbers, outFd);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static int[] readFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        int[] numbers = new int[49];
        int index = 0;
        String line;
        while ((line = br.readLine()) != null) {
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                numbers[index++] = Integer.parseInt(token);
            }
        }
        br.close();

        return Arrays.copyOfRange(numbers, 0, index);
    }

    // Generates all possible 6-number combinations and writes them to the output file
    public static void generateCombinations(int[] numbers, File outFd) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(outFd));

        // Generate all combinations of 6 numbers
        for (int i = 0; i < numbers.length - 5; i++) {
            for (int j = i + 1; j < numbers.length - 4; j++) {
                for (int k = j + 1; k < numbers.length - 3; k++) {
                    for (int l = k + 1; l < numbers.length - 2; l++) {
                        for (int m = l + 1; m < numbers.length - 1; m++) {
                            for (int n = m + 1; n < numbers.length; n++) {
                                int[] combination = {numbers[i], numbers[j], numbers[k], numbers[l], numbers[m], numbers[n]};
                                if (passesFilters(combination)) {
                                    // Save the combination to the output file
                                    writer.write(Arrays.toString(combination).replaceAll("[\\[\\],]", "").replaceAll(" ", " "));
                                    writer.newLine();
                                }
                            }
                        }
                    }
                }
            }
        }
        writer.close();
        System.out.println("Combinations saved to " + outFd.getAbsolutePath());
    }

    // Checks if a combination passes all the filters
    public static boolean passesFilters(int[] arr) {
        return !isEvenGE(arr, 5) && !isOddGE(arr, 5) && !consecutive(arr) && !sameEnding(arr, 4) && !sameTen(arr, 4);
    }


    /**
     * Returns true if the number of evens is greater than or
     * equal to a threshold limit.
     *
     * @param arr
     *          the input array.
     * @param threshold
     *          the upper limit of the constraint.
     * @return
     *          true, if the number of evens is greater
     *          than or equal to a threshold limit, false
     *          otherwise.
     */
    public static boolean isEvenGE(int[] arr, int threshold) {
        long evenCount;

        evenCount = Arrays.stream(arr)
                .filter(num -> num % 2 == 0)
                .count();

        return evenCount >= threshold;
    }

    /**
     * Returns true if the number of odds is greater than or
     * equal to a threshold limit.
     *
     * @param arr
     *          the input array.
     * @param threshold
     *          the upper limit of the constraint.
     * @return
     *          true, if the number of odds is greater
     *          than or equal to a threshold limit, false
     *          otherwise.
     */
    public static boolean isOddGE(int[] arr, int threshold) {
        long oddsCount;
        oddsCount = Arrays.stream(arr)
                .filter(num -> num % 2 != 0)
                .count();

        return oddsCount >= threshold;
    }

    /**
     * Returns true if threshold or more numbers are in the
     * same ten.
     *
     * @param arr
     *      the input array.
     * @param threshold
     *      the threshold.
     * @return
     *      true, if GE (Greater or Equal) to threshold numbers
     *      are in the same ten.
     */
    public static boolean sameTen(int[] arr, int threshold) {
        int[] ten = new int[5];

        for (int num : arr) {
            ten[num/10]++;
        }

        return Arrays.stream(ten).anyMatch(t -> t >= threshold);
    }

    /**
     * Returns true if more than two numbers are consecutive.
     *
     * @param arr
     *      the input array.
     * @return
     *      true, if more than two numbers are consecutive.
     */
    public static boolean consecutive(int[] arr) {
        Arrays.sort(arr);

        int consecutiveCount = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] - 1) {
                consecutiveCount++;
            } else {
                consecutiveCount = 0;
            }
        }

        return consecutiveCount > 2;
    }

    /**
     * Returns true if threshold or more numbers have the same ending.
     *
     * @param arr
     *      the input array.
     * @param threshold
     *      the threshold.
     * @return
     *      true, if GE (Greater or Equal) to threshold numbers
     *      have the same ending.
     */
    public static boolean sameEnding(int[] arr, int threshold) {
        int[] endings = new int[10];

        for (int num : arr) {
            endings[num % 10]++;
        }

        return Arrays.stream(endings).anyMatch(e -> e >= threshold);
    }


}
