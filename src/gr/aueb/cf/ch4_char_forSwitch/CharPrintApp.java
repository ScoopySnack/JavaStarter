package gr.aueb.cf.ch4_char_forSwitch;

/**
 * Print chars
 */
public class CharPrintApp {

    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 'B';

        System.out.println("char: " + ch1 + "ordinal" + (int) ch1 );
        System.out.println("char: " + ch2 + "ordinal" + (int) ch2 );

        System.out.printf("Char : %c, ordinal: %d\n", ch1, (int)ch1);
        System.out.printf("Char : %c, ordinal: %d\n", ch2, (int)ch2);
    }
}
