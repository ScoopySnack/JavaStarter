package gr.aueb.cf.ch19_generics_collections.sets;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();

        bag.add("apple");
        bag.add("banana");
        bag.add("orange");  //no duplicates allowed

        if(bag.contains("banana")) {
            bag.remove("banana");
        } else {
            System.out.println("The bag does not contain banana");
        }

        bag.forEach(System.out::println);
    }
}
