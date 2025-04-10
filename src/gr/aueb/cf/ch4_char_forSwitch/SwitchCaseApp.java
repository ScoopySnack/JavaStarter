package gr.aueb.cf.ch4_char_forSwitch;

import java.util.Scanner;

/**
 * Demo of Switch/case
 */
public class SwitchCaseApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("Επιλέξτε ένα από τα παρακάτω:");
            System.out.println("1. Once-player game");
            System.out.println("2. Two-player game");
            System.out.println("3. Team game");
            System.out.println("4. Quit");

            choice = scanner.nextInt();

            if (choice < 1 || choice > 4){
                System.out.println("Choice must be between 1-4");
                System.out.println("Try again");
                continue;
            }

//            if (choice == 1){
//                System.out.println("One-player started.");
//            } else if (choice == 2) {
//                System.out.println("Two-player started.");
//            } else if (choice == 3) {
//                System.out.println("Team player started");
//            }else {
//                System.out.println("Quitting...");
//            }

            switch (choice){
                case 1:
                    System.out.println("One-player game started.");
                    break;
                case 2:
                    System.out.println("Two-player game started.");
                    break;
                case 3:
                    System.out.println("Team player game started");
                    break;
                case 4:
                    System.out.println("Quitting...");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }

        }while (choice != 4);
    }
}
