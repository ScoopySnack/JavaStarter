package gr.aueb.cf.ch5_floats;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού επιλογών και
 * ο χρήστης επιλέγει ένα menu item και στη συνέχεια
 * ανάλογα με την επιλογή,
 * εκτελείται κάποια ενέργεια
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice ;

        do{
            printMenu();
            choice = scanner.nextInt();

            if (!isChoiceValid(choice)){
                System.out.println(("Error. Choice not valid."));
                continue;
            }

            doOnChoice(choice);

        }while (choice != 5);
    }

    public static void printMenu(){
        System.out.println("Επιλέξτε ένα από τα παρακάτω ή 5 για έξοδο");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Ενημέρωση");
        System.out.println("4. Αναζήτηση");
        System.out.println("5. Έξοδος");
    }

    public static boolean isChoiceValid(int choice){
        return choice >= 1 && choice <=5;
    }

    public static void doOnChoice(int choice){

        switch (choice){
            case 1:
                System.out.println("Εισαγωγή process");
                break;
            case 2:
                System.out.println("Διαγραφή process");
                break;
            case 3:
                System.out.println("Ενημέρωση process");
                break;
            case 4:
                System.out.println("Αναζήτηση process");
                break;
            case 5:
                System.out.println("Έξοδος process");
                break;
            default:
                System.out.println("Λάθος επιλογή");
                break;
        }
    }
}
