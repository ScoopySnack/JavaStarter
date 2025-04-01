package gr.aueb.cf.ch9_IO.challenges;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class LocationsJavaIO {

    public static void main(String[] args) {
        String inFilePath = "C:/tmp/locations.txt";
        String outFilePath = "C:/tmp/locations-formated.txt";
        String line;

        String[]  tokens;

        try(BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
            PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)){
            String firstLine = reader.readLine();
            String[] headerTokens = firstLine.split(",");
            while ((line = reader.readLine()) != null){

                tokens = line.split(",+\\s*");
                printFormatted(ps,tokens);
                printFormatted(System.out,tokens);
            }

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
    public static void printFormatted(PrintStream ps, String[] tokens) {
        ps.printf("{ \"location\": \"%s\", \"latitude\": \"%s\", \"longitude\": \"%s\" },\n", tokens[0], tokens[1], tokens[2]);
    }


}
