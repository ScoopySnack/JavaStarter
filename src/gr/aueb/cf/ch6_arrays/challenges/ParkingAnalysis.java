package gr.aueb.cf.ch6_arrays.challenges;

import java.util.Arrays;

public class ParkingAnalysis {

    public static void main(String[] args) {
        int[][] arr = {
                {1012, 1136},
                {1317, 1417},
                {1015, 1020}
        };

        int maxCars = getMaxCarsParked(arr);
        System.out.println("Maximum number of cars parked at the same time: " + maxCars);
    }

    public static int getMaxCarsParked(int[][] arr) {
        // Step 1: Create an array to store times and their types (arrival or departure)
        int[][] events = new int[arr.length * 2][2];
        int index = 0;

        for (int[] car : arr) {
            events[index][0] = car[0]; // Arrival time
            events[index][1] = 1;     // Arrival marked as 1
            index++;
            events[index][0] = car[1]; // Departure time
            events[index][1] = 0;     // Departure marked as 0
            index++;
        }

        // Step 2: Sort the events array by time
        // If two events have the same time, arrivals (1) should come before departures (0)
        Arrays.sort(events, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1]; // Sort by type in descending order (1 before 0)
            }
            return a[0] - b[0]; // Sort by time in ascending order
        });

        // Step 3: Traverse the sorted array and calculate the maximum overlap
        int maxCars = 0, currentCars = 0;
        for (int[] event : events) {
            if (event[1] == 1) { // Arrival
                currentCars++;
                maxCars = Math.max(maxCars, currentCars);
            } else { // Departure
                currentCars--;
            }
        }

        return maxCars;
    }
}
