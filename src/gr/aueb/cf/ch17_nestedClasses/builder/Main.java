package gr.aueb.cf.ch17_nestedClasses.builder;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book.Builder(1,"12345").build();
        Book book2 = new Book.Builder(2,"6789")
                .author("Th")
                .title("Java")
                .build();
    }
}
