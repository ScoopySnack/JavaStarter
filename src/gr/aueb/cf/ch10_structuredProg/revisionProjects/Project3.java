package gr.aueb.cf.ch10_structuredProg.revisionProjects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Το πρόγραμμα πρέπει να διαβάσει χαρακτήρες από ένα αρχείο, να τους εισάγει σε έναν πίνακα διαστάσεων 128x2
 * και να καταγράψει τη συχνότητα κάθε χαρακτήρα, αγνοώντας τα κενά.
 */
public class Project3 {

    public static void main(String[] args) {
        int[][] charTable = new int[128][2];
        for (int i = 0; i < charTable.length; i++) {
            charTable[i][0] = i;
        }

        try (BufferedReader br = new BufferedReader(new FileReader("C:/tmp/chars.txt"))) {
            int ch;
            while ((ch = br.read()) != -1) {
                if (ch >= 32 && ch < 128) { // Ignore spaces
                    charTable[ch][1]++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ταξινόμηση και εκτύπωση ανά χαρακτήρα
        Arrays.sort(charTable, (a, b) -> Integer.compare(a[0], b[0]));
        System.out.println("Character Frequencies Sorted by Character:");
        for (int[] entry : charTable) {
            if (entry[1] > 0) {
                System.out.println((char) entry[0] + ": " + entry[1]);
            }
        }

        // Ταξινόμηση και εκτύπωση ανά συχνότητα
        Arrays.sort(charTable, (a, b) -> Integer.compare(b[1], a[1]));
        System.out.println("Character Frequencies Sorted by Frequency:");
        for (int[] entry : charTable) {
            if (entry[1] > 0) {
                System.out.println((char) entry[0] + ": " + entry[1]);
            }
        }
    }
}
