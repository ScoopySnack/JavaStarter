package gr.aueb.cf.ch20_enums_lambdas_regex.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapturingRegEx {

    public static void main(String[] args) {
        String s = "HelloWorld HelloWorld";

        Pattern pattern = Pattern.compile("(Hello)(World)"); // Capturing groups
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            for (int i = 0; i <= matcher.groupCount() ; i++) {
                System.out.println(matcher.group(i) + " ");
            }
            System.out.println();
        }
    }
}
