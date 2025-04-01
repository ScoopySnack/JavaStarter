package gr.aueb.cf.ch10_structuredProg.revisionProjects;

import java.util.Arrays;

/**
 * Δημιουργία προγράμματος για τη διαχείριση κρατήσεων θεάτρου με 30 σειρές και 12 στήλες.
 * Υποθέστε ότι ο δισδιάστατος πίνακας που απεικονίζει το θέατρο είναι ένα πίνακας από boolean, όπου το true σημαίνει
 * ότι η θέση είναι booked και false ότι δεν είναι booked. Αρχικά όλες οι θέσεις πρέπει να είναι non-booked.
 */
public class Project5 {

    public static final int ROWS = 30;
    public static final int COLUMNS = 12;
    public static boolean[][] seats = new boolean[ROWS][COLUMNS];

    public static void main(String[] args) {

        for (boolean[] seat : seats) {
            Arrays.fill(seat, false);
        }

        System.out.println("Αρχική κατάσταση του θεάτρου:");
        printSeats();

        book('A', 1);
        book('B', 2);

        System.out.println("Κατάσταση του θεάτρου μετά τις κρατήσεις:");
        printSeats();

        cancel('A', 1);
        cancel('B', 2);

        System.out.println("Κατάσταση του θεάτρου μετά τις ακυρώσεις:");
        printSeats();

    }

    public static void printSeats() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                char status = seats[row][col] ? 'X' : 'O';
                System.out.print(status + " ");
            }
            System.out.println();
        }
    }


    public static void book(char column, int row) {
        int colIndex = column - 'A';
        if (row < 1 || row > ROWS || colIndex < 0 || colIndex >= COLUMNS) {
            System.out.println("Invalid seat!");
            return;
        }

        if (seats[row - 1][colIndex]) {
            System.out.println("Seat " + column + row + " is already booked.");
        } else {
            seats[row - 1][colIndex] = true;
            System.out.println("Seat " + column + row + " successfully booked.");
        }
    }

    public static void cancel(char column, int row) {
        int colIndex = column - 'A';
        if (row < 1 || row > ROWS || colIndex < 0 || colIndex >= COLUMNS) {
            System.out.println("Invalid seat!");
            return;
        }

        if (!seats[row - 1][colIndex]) {
            System.out.println("Seat " + column + row + " is already free.");
        } else {
            seats[row - 1][colIndex] = false;
            System.out.println("Seat " + column + row + " successfully canceled.");
        }
    }
}
