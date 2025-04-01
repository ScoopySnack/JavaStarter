package gr.aueb.cf.ch4_char_forSwitch;

/**
 * Special types of for
 */
public class SpecialFor {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1; i++) {
            System.out.println("Repeated ONCE ");
        }

        for (int i = 1, j =10; i < j ; i++, j--) {
            System.out.println(i + ", " + j);
        }

        for (;;) { // eternal loop
            System.out.println("For Ever");
            count++;
        }
    }
}
