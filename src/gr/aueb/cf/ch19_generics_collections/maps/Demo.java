package gr.aueb.cf.ch19_generics_collections.maps;

import java.util.Map;
import java.util.stream.Collectors;

public class Demo {


    public static void main(String[] args) {

        Map<String, String> countries = Map.of(
                "GR", "Greece",
                "US", "United States",
                "EN", "England"
        );


        countries.forEach((k,v) -> System.out.println("Key: " + k + " value: " + v));

        var filteredCountries = countries.entrySet().stream()
                .filter(e -> e.getKey().length() <= 2)
                .collect(Collectors.toSet());

        filteredCountries.forEach(System.out::println);
    }
}
