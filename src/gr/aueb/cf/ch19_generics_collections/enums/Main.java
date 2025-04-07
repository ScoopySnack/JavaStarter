package gr.aueb.cf.ch19_generics_collections.enums;

import static gr.aueb.cf.ch19_generics_collections.enums.UserRole.*;

public class Main {

    public static void main(String[] args) {
       // UserRole role[] = UserRole.values(); // Get all enum values

        String strRole = STUDENT.name(); //like toString()

        System.out.println("User role: " + strRole);

        // Example of using enum in a switch statement
//        case role:
//        switch (role) {
//            case ADMIN:
//                System.out.println("You have admin privileges.");
//                break;
//            case TEACHER:
//                System.out.println("You are a teacher.");
//                break;
//            case STUDENT:
//                System.out.println("You are a student.");
//                break;
//            default:
//                System.out.println("Unknown role.");
//        }
    }
}
