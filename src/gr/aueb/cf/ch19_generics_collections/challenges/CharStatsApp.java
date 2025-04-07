package gr.aueb.cf.ch19_generics_collections.challenges;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Άσκηση: Αναπτύξτε μία εφαρμογή που να μπορεί να διαβάζει χαρακτήρα-χαρακτήρα ένα αρχείο
 * κειμένου και να εισάγει τους χαρακτήρες σε μία λίστα διπλής κατεύθυνσης (π.χ. LinkedList)
 * Στη συνέχεια να εξάγει στατιστικά στοιχεία για κάθε χαρακτήρα,
 * όπως η συχνότητα εμφάνισης, ταξινομημένη 1) ανά χαρακτήρα ascending και 2) ανά ποσοστό descending
 */
public class CharStatsApp {

    public static void main(String[] args) {
        String filePath = "src/gr/aueb/cf/ch19_generics_collections/challenges/charStats.txt";

        LinkedList<Character> charList = new LinkedList<>();
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Read the file character by character
        try(BufferedReader rd = new BufferedReader(new FileReader(filePath))){
            int ch;
            while ((ch = rd.read()) != -1) {
                char c = (char) ch;
                charList.add(c);
                charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
            }
        } catch (IOException e) {
            System.err.println("Σφάλμα κατά την ανάγνωση αρχείου: " + e.getMessage());
            return;
        }

        int totalChars = charList.size();


        //Ταξινόμηση ανά χαρακτήρα ascending
        System.out.println("Στατιστικά ανά χαρακτήρα (ascending):");
        charFrequencyMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(entry -> {
                        char c = entry.getKey();
                    int count = entry.getValue();
                    double percentage = (count * 100.0) / totalChars;
                    System.out.printf("'%s': %d φορές (%.2f%%)%n", printableChar(c), count, percentage);
                });

        //Ταξινόμηση ανά ποσοστό descending
        System.out.println("\nΣτατιστικά ανά ποσοστό (descending):");
        charFrequencyMap.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> {
                    char c = entry.getKey();
                    int count = entry.getValue();
                    double percentage = (count * 100.0) / totalChars;
                    System.out.printf("'%s': %d φορές (%.2f%%)%n", printableChar(c), count, percentage);
                });
    }

    // Αντικαθιστά μη εκτυπώσιμους χαρακτήρες με αναγνώσιμα strings
    private static String printableChar(char c) {
        return switch (c) {
            case '\n' -> "\\n";
            case '\r' -> "\\r";
            case '\t' -> "\\t";
            case ' ' -> "[space]";
            default -> String.valueOf(c);
        };

    }
}
