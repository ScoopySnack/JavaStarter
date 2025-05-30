package gr.aueb.cf.ch19_generics_collections.streams;

import java.util.List;
import java.util.Optional;

public class FindAndMatch {

    public static void main(String[] args) throws Exception {
        List<String> names = List.of("John", "Jane", "Bob", "Jill", "Joe");

        //Optional is a class/container for wrapping null. Avoid NPE
        Optional<String> query = names.stream().filter(name -> name.startsWith("J"))
                .findFirst();

        if (query.isPresent()){ //ifPresent is a method of Optional that checks if the value is present
            System.out.println("Firstname: " + query.get());
        }

        query.ifPresent(first -> System.out.println("Firstname: " + first));

        //Handling empty values with orElse and orElseThrow
        String strFirst = names.stream()
                .filter(name -> name.equals("Bob"))
                .findFirst().orElse(null);

        String strFirst2 = names.stream()
                .filter(name -> name.equals("Bob"))
                .findFirst().orElseThrow(() -> new Exception("Not found"));

        //Match
        boolean isBobExists = names.stream()
                .anyMatch(name -> name.equals("Bob"));

        boolean allAreBob = names.stream()
                .allMatch(name-> name.equals("Bob"));

        boolean noneIsBob = names.stream()
                .noneMatch(name -> name.equals("Bob"));
    }
}
