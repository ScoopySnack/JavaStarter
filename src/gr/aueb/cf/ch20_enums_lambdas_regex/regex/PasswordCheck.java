package gr.aueb.cf.ch20_enums_lambdas_regex.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheck {

    public static void main(String[] args) {
        String password = "Abc1234!@";
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$");
        // ^ - start of string, (?=.*[a-z]) - at least one lowercase letter, (?=.*[A-Z]) - at least one uppercase letter,
        // (?=.*\\d) - at least one digit, (?=.*[@#$%^&+=!]) - at least one special character, .{8,} - at least 8 characters
        Matcher matcher = pattern.matcher(password);

        while (matcher.find()){
            System.out.println(matcher.group());
            System.out.println("Password is valid"); //
        }

    }
}
