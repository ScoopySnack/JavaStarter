package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού επιλογών (1. Πρόσθεση, 2. Αφαίρεση, ... ), ο χρήστης επιλέγει
 * Ανάλογα με την επιλογή εκτελείται η αντίστοιχη πράξη
 * και εκτυπώνεται το αποτέλεσμα.
 * Εκτελείται επαναληπτικά μέχρι ο χρήστης να επιλέξει 'Έξοδος'
 */
public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice, result;

        while (true) {
            printMenu();
            choice = getOneInt();

            if (!isChoiceValid(choice)){
                System.out.println("Error. Choice must be between 1-6. Try again.");
                continue;
            }

            if (choice == 6){
                System.out.println("Έξοδος...");
                break;
            }

            result = getResultOnChoice(choice);
            System.out.println("Result: " + result);
        }
    }

    public static void printMenu(){
        System.out.println("Επιλέξτε ένα από τα παρακάτω ή 5 για έξοδο");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Υπόλοιπο διαίρεσης");
        System.out.println("6. Έξοδος");
    }

    public static int getOneInt(){
        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice){
        return choice >= 1 && choice <=6;
    }

    public static int getResultOnChoice(int choice) {
        int num1, num2, result = 0;

        System.out.println("Παρακαλώ εισάγετε 2 ακεραίους");
        num1 = getOneInt();
        num2 = getOneInt();

        switch (choice){
            case 1:
                result =  add(num1, num2);
                break;
            case 2:
                result= sub(num1, num2);
                break;
            case 3:
                result = mul(num1,num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            default:
                System.out.println("Λάθος επιλογή");
                break;
        }
        return result;
    }


    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int sub(int num1, int num2){
        return num1 - num2;
    }

    public static int mul(int num1, int num2){
        return num1 * num2;
    }

    public static int div(int num1, int num2){
        if (num2 == 0) return 0;
        return num1 / num2;
    }

    public static int mod(int num1, int num2){
        if (num2 == 0) return 0;
        return num1 % num2;
    }
}
