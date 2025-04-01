package gr.aueb.cf.ch6_arrays.challenges;

import java.util.Scanner;
import java.util.Arrays;


public class LottoFilters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];

        System.out.println("Enter 6 integers between 1 and 49:");
        for (int i = 0; i < 6; i++) {
            while (true) {
                System.out.print("Number " + (i + 1) + ": ");
                int num = scanner.nextInt();
                if (num >= 1 && num <= 49) {
                    numbers[i] = num;
                    break;
                } else {
                    System.out.println("Please enter a number between 1 and 49.");
                }
            }
        }

        // Check all filters
        boolean passesFilters = checkEvenNumbers(numbers)
                && checkOddNumbers(numbers)
                && checkConsecutiveNumbers(numbers)
                && checkSameLastDigit(numbers)
                && checkSameDecade(numbers);

        if (passesFilters) {
            System.out.println("Your numbers pass all the filters!");
        } else {
            System.out.println("Your numbers do not pass the filters.");
        }
    }

    // Έλεγχος για μέγιστο 3 άρτιους
    // Check for a maximum of 3 even numbers
    public static boolean checkEvenNumbers(int[] numbers) {
        int countEven = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                countEven++;
            }
        }
        return countEven <= 3;
    }

    // Check for a maximum of 3 odd numbers
    public static boolean checkOddNumbers(int[] numbers) {
        int countOdd = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                countOdd++;
            }
        }
        return countOdd <= 3;
    }

    // Check for a maximum of 3 consecutive numbers
    public static boolean checkConsecutiveNumbers(int[] numbers) {
        Arrays.sort(numbers); // Sort the array
        int consecutiveCount = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1] + 1) {
                consecutiveCount++;
                if (consecutiveCount > 3) {
                    return false;
                }
            } else {
                consecutiveCount = 1; // Reset counter
            }
        }
        return true;
    }

    // Check for a maximum of 3 numbers with the same last digit
    public static boolean checkSameLastDigit(int[] numbers) {
        int[] lastDigitCount = new int[10];
        for (int num : numbers) {
            lastDigitCount[num % 10]++;
        }
        for (int count : lastDigitCount) {
            if (count > 3) {
                return false;
            }
        }
        return true;
    }

    // Check for a maximum of 3 numbers in the same decade
    public static boolean checkSameDecade(int[] numbers) {
        int[] decadeCount = new int[5];
        for (int num : numbers) {
            decadeCount[num / 10]++;
        }
        for (int count : decadeCount) {
            if (count > 3) {
                return false;
            }
        }
        return true;
    }
}
