package gr.aueb.cf.ch19_generics_collections.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMain {

    public static void main(String[] args) {
        //list of strings
        List<String> cities = List.of("Athens", "Thessaloniki", "Patra", "Heraklion", "Chania");

        var tCities = cities.stream()
                .filter(city -> city.startsWith("T"))
                .collect(Collectors.toList());          // Java8+, mutable List

        var tCities2 = cities.stream()
                .filter(city -> city.length() >= 6)
                .toList();                              // Java16+, immutable list

        tCities.forEach(System.out::println);

        Set<String> uniqueCityNames = cities.stream().collect(Collectors.toSet());
        //Set<String> uniqueCityNames = new HashSet<>(cities);
        uniqueCityNames.forEach(System.out::println);

        String strCities = cities.stream().collect(Collectors.joining(", "));

        //String strCities = String.join(", ", cities);
        System.out.println(strCities);

    }
}
