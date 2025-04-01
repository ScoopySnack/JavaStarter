package gr.aueb.cf.ch8_exceptions.challenges;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Scanner;

public class FirstEx {
static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        while (true){
            try {
                printMenu();
                choice = getChoice();
                if (choice == 5) break;
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Choice. Try again.");
            }
        }
        System.out.println("Goodbye!");
    }

    public static void printMenu(){
        System.out.println("Επιλέξτε ένα από τα παρακάτω ή 5 για έξοδο");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Ενημέρωση");
        System.out.println("4. Αναζήτηση");
        System.out.println("5. Έξοδος");
    }

    public static int getChoice(){
        int choice;
        while (!in.hasNextInt()){
            System.out.println("Error. Input must be int. Try again.");
            in.nextLine();
        }
        choice = in.nextInt();
        in.nextLine();

        try {
            if (!isValidChoice(choice)) throw new IllegalArgumentException("Error. Επιλογή: " + choice + ".\nH επιλογή πρέπει να είναι μεταξύ 1-5.");
            return choice;
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    public static void printChoice(int choice)  {
        System.out.println("Choice: " + choice);
    }

    public static boolean isValidChoice(int choice) {
        return (choice >= 1) && (choice <= 5);
    }

    public static void log(Exception e) {
        Path path = Paths.get("C:/tmp/log.txt");    // Create a path with nio

        try (PrintStream ps = new PrintStream(new FileOutputStream(path.toFile(), true))) { // true is for append
            ps.println(LocalDateTime.now() + "\n" + e.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
