package gr.aueb.cf.ch20_enums_lambdas_regex.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDateNamed {

    public static void main(String[] args) {
        String s = "12/21/2024";

        Pattern pattern = Pattern.compile("(?<month>\\d{2})/(?<day>\\d{2})/(?<year>\\d{4})");
        Matcher matcher = pattern.matcher(s);

        //Attempts to match the entire region against the pattern
        if (matcher.matches()){
            String month = matcher.group("month");
            String day = matcher.group("day");
            String year = matcher.group("year");
            String out = day + "/" + month + "/" + year;
            System.out.println(out);
        }else {
            System.out.println("Invalid date");
        }
    }
}
