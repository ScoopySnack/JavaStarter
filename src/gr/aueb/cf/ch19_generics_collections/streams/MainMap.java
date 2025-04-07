package gr.aueb.cf.ch19_generics_collections.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainMap {

    public static void main(String[] args) {
        List<Product> products = List.of(new Product("Laptop", 1000, 1),
                new Product("Smartphone", 800, 2),
                new Product("Tablet", 500, 4));

        ArrayList<String> listOfProducts = products.stream().map(Product::getName)
                .collect(Collectors.toCollection(ArrayList::new));  //ArrayList is returned

        List<String> listOfProducts2 = products.stream().map(Product::getName)
                .collect(Collectors.toList());  //Unspecified implementation

        int totalQuantities = products.stream()
                .filter(p -> p.getName().equals("Laptop"))
                .mapToInt(Product::getQuantity)
                .sum();

        double totalPrice = products.stream()
                .filter(p -> p.getName().equals("Tablet"))
                .mapToDouble(Product::getPrice)
                .sum();
    }
}
