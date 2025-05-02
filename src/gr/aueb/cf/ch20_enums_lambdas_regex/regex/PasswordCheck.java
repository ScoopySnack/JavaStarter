package gr.aueb.cf.ch20_enums_lambdas_regex.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User gives a password and the program checks if it is valid.
 * A valid password must contain at least:
 * - 8 characters
 * - 1 lowercase letter
 * - 1 uppercase letter
 * - 1 digit
 * - 1 special character (#?!@$%^&*-)
 */
public class PasswordCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#?!@$%^&*-]).{8,}$");
        // ^ - start of string, (?=.*[a-z]) - at least one lowercase letter, (?=.*[A-Z]) - at least one uppercase letter,
        // (?=.*\\d) - at least one digit, (?=.*[@#$%^&+=!]) - at least one special character, .{8,} - at least 8 characters

        while (true) {
            System.out.print("Enter password: ");
            String password = sc.nextLine();
            Matcher matcher = pattern.matcher(password);

            if (matcher.find()) {
                System.out.println("Password is valid");
                break; // exit loop when password is valid
            } else {
                System.out.println("Password is invalid. Try again.");
            }

        }

        sc.close();
    }
}
