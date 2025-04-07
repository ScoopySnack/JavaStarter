package gr.aueb.cf.ch19_generics_collections.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        // Adding elements to the map
        countries.put("GR", "Greece");
        countries.put("US", "United States");
        countries.put("EN", "England");

        //Updating an existing element
        countries.put("US", "U. States");

        //Get an element
        String value = countries.get("GR");
        System.out.println(value);

        //Iterating over the map
        Iterator<Map.Entry<String, String>> it = countries.entrySet().iterator();

        while (it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            System.out.println("Key: " + entry.getKey() + "value: " + entry.getValue());
        }

        //with enhanced for loop
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
        }

        //with forEach
        countries.forEach((k,v) -> {
            System.out.println("Key: " + k + " value: " + v);
        });


        //Removing an element
        countries.remove("EN");

    }
}
