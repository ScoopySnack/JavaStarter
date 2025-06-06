package gr.aueb.cf.ch20_enums_lambdas_regex.regex;

public class RegExMain {

    public static void main(String[] args) {
        String s = "Angeliki Nikolaou";
        System.out.println(isRed(s));
        System.out.println(isRedOrGreen(s));
        System.out.println(beginsWithOneUpperCaseAndEndsInIng(s));
        System.out.println(whitespaceDigit(s));
        System.out.println(anySymbolDigit(s));
        System.out.println(isEmail(s));
        System.out.println(isDate(s));
        System.out.println(isrRedOrgGreen(s));
        System.out.println(isOneLetterEndsIng(s));
        String[] tokens = doSplit(s);

        for (String token : tokens) {
            System.out.println(token);
        }
        System.out.println(doReplace(s));
        System.out.println(doReplaceBackReference(s));
    }

    /**
     * Ελέγχει (matches) αν το input string
     * είναι το "red"
     */
    public static boolean isRed(String s) {
        return (s!= null) && (s.matches("red"));
    }

    /**
     * Ελέγχει (matches) αν το input string
     * είναι "red" ή "green"
     */
    public static boolean isRedOrGreen(String s) {
        return s.matches("red|green");
    }

    /**
     * Ελέγχει (matches) αν το input string
     * είναι "red" ή "Red" ή "green" ή "Green"
     */
    public static boolean isrRedOrgGreen(String s) {
        return s.matches("[rR]ed|[gG]reen]");
    }

    /**
     * Ελέγχει (matches) αν το input string
     * αρχίζει με κεφαλαίο γράμμα και τελειώνει σε "ing"
     */
    public static boolean beginsWithOneUpperCaseAndEndsInIng(String s) {
        return s.matches("[A-Z]ing");
    }


    public static boolean isOneLetterEndsIng(String s) {
        return s.matches("[A-Za-z]ing");
    }

    /**
     * Ελέγχει (matches) αν το input string
     * περιέχει κενό και ψηφίο
     */
    public static boolean whitespaceDigit(String s) {
        return s.matches("\\s\\d");
    }

    /**
     * Ελέγχει (matches) αν το input string
     * περιέχει οποιοδήποτε σύμβολο και ψηφίο
     */
    public static boolean anySymbolDigit(String s) {
        // return s.matches(".\\d");
        return s.matches(".[0-9]");
    }

/**
     * Ελέγχει (matches) αν το input string
     * είναι email
 */
    public static boolean isEmail(String s) {
        return s.matches("\\w*\\.?\\w+@\\w+\\.[a-z]{2,4}");
    }

    /**
     * Ελέγχει (matches) αν το input string
     * είναι ημερομηνία
     */
    public static boolean isDate(String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    /**
     * Χωρίζει το input string σε tokens
     * με βάση τα κενά
     */
    public static String[] doSplit(String s) {
        return s.split("\\s+");
    }

    /**
     * Αντικαθιστά τα κενά με ένα κενό
     */
    public static String doReplace(String s) {
        return s.replaceAll("\\s+", " ");
    }

    /**
     * Αντικαθιστά το πρώτο και το δεύτερο μέρος του string
     * με το δεύτερο και το πρώτο αντίστοιχα
     */
    public static String doReplaceBackReference(String s) {
        return s.replaceAll("(.+)\\s+(.+)", "$2 $1");
    }

    

}
