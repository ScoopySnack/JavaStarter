package gr.aueb.cf.ch5_floats.challenges;

import java.util.Scanner;

/**
 * Δημιουργήστε μία εφαρμογή που να εμφανίζει ένα μενού με 6επιλογές:
 * 1. Εμφάνισε n αστεράκια οριζόντια
 * 2. Εμφάνισε n αστεράκια κάθετα
 * 3. Εμφάνισε n γραμμές με n αστεράκια
 * 4. Εμφάνισε n γραμμές με αστεράκια 1 έως n
 * 5. Εμφάνισε n γραμμές με αστεράκια n έως 1
 * 6. Έξοδος από το πρόγραμμα Δώσε επιλογή:
 * ...
 * Και μετά: Δώστε αριθμό για αστεράκια
 */
public class AsterakiaWithMethods {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int choice;

        do{
            printMenu();
            choice = in.nextInt();

            if (!isChoiceValid(choice)){
                System.out.println(("Error. Choice not valid."));
                continue;
            }

            System.out.println("Δώστε αριθμό για αστεράκια:");
            n = in.nextInt();
            doOnChoice(choice,n);

        }while (choice != 6);

    }

    public static void printMenu(){
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
        System.out.println();
        System.out.println("Δώσε επιλογή:");
    }

    public static boolean isChoiceValid(int choice){
        return choice >= 1 && choice <=6;
    }

    public static void doOnChoice(int choice, int n){

        switch (choice){
            case 1:
                horizontal(n);
                break;
            case 2:
                vertical(n);
                break;
            case 3:
                nXn(n);
                break;
            case 4:
                ascN(n);
                break;
            case 5:
                descN(n);
                break;
            case 6:
                System.out.println("..Quiting...");
                break;
            default:
                System.out.println("Λάθος επιλογή");
                break;
        }
    }

    public static void horizontal(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static void vertical(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public static void nXn(int n){
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n-1; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

    public static void ascN(int n){
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

    public static void descN(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = i; j <= n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
