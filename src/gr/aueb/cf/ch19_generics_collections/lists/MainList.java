package gr.aueb.cf.ch19_generics_collections.lists;

import java.util.ArrayList;
//import java.util.Iterator;

/**
 * Demonstrates the use of ArrayList class.
 * It shows how to add, get, set, remove elements,
 * and how to use indexOf() and removeIf() methods.
 * CRUD API (Create, Read, Update, Delete).
 */
public class MainList {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        //add() method
        cities.add("Athens");
        cities.add("Thessaloniki");
        cities.add("Patras");

        //get() method
        String city = cities.get(0);
        System.out.println("City: " + city);

        //indexOf() method
        int myPosition = cities.indexOf("Thessaloniki");

        //set() method, updating the value at the specified index
        if (myPosition != -1) {
            cities.set(myPosition, "Thessaloniki");
        } else {
            System.out.println("Thessaloniki not found in the list.");
        }

        //remove() method
        if (cities.contains("Patras")) { //contains() method is used to check if the list contains the element
            cities.remove("Patras");
        } else {
            System.out.println("Patras not found in the list.");
        }

        //removeIf() method, takes a lambda expression as a predicate
        cities.removeIf(cityName -> cityName.startsWith("A")); //boolean predicate

        //iterating over the list
        //simple for loop
        for (int i = 0; i < cities.size(); i++) {
            System.out.println("City at index " + i + ": " + cities.get(i));
        }
        //enhanced for loop
        for (String cityName : cities) {
            System.out.println("City: " + cityName);
        }
        //forEach() method
        cities.forEach(cityName -> System.out.println("City: " + cityName));

        //forEach() method with method reference
        cities.forEach(System.out::println);

        //using an iterator
//        Iterator<String> iterator = cities.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
