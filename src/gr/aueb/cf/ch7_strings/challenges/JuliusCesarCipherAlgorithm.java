package gr.aueb.cf.ch7_strings.challenges;

public class JuliusCesarCipherAlgorithm {

    public static void main(String[] args) {
        String s = "BUZZ";
        final int KEY = 3;

        String encrypted = encrypt(s, KEY);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = decrypt(encrypted, KEY);
        System.out.println("Decrypted: " + decrypted);
    }


    public static String encrypt(String s, int key){
        StringBuilder encrypted = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isUpperCase(ch)){ //Κρυπτογραφεί μόνο κεφαλαία
                encrypted.append(cipher(ch,key));
            }else{
                encrypted.append(ch);  //Κρατά τους υπόλοιπος χαρακτήρες όπως είναι
            }
        }

        return encrypted.toString();
    }

    /**
     * Αποκρυπτογραφεί ένα κρυπτογραφημένο κείμενο
     * @param s το κρυπτογραφημένο κείμενο
     * @param key το κλειδί
     * @return το αποκρυπτογραφημένο κείμενο
     */
    public static String decrypt(String s, int key){
        StringBuilder decrypted = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isAlphabetic(ch)){ //Ελέγχει αν είναι γράμμα
                decrypted.append(decipher(ch,key));
            }else{
                decrypted.append(ch);  //Κρατά τους υπόλοιπος χαρακτήρες όπως είναι
            }
        }

        return decrypted.toString();
    }

    public static char cipher(char ch, int key) {
        int base = 'A'; // Ξεκινάμε από το 'A'
        int latinCount = 26; // Αριθμός γραμμάτων στο λατινικό αλφάβητο
        int m = ch - base; // Θέση του γράμματος στο αλφάβητο
        int c = (m + key) % latinCount; // Μετατόπιση με κυκλικότητα

        return (char) (c + base); // Επιστρέφει το νέο γράμμα
    }


    public static char decipher(char ch, int key) {
        int base = 'A';
        int latinCount = 26;
        int c = ch - base; // Θέση του γράμματος στο αλφάβητο
        int m = ((c - key) + latinCount) % latinCount; // Αντιστροφή της μετατόπισης με κυκλικότητα

        return (char) (m + base);
    }

}
