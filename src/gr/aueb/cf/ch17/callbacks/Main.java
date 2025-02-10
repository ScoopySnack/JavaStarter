package gr.aueb.cf.ch17.callbacks;

public class Main {

    public static void main(String[] args) {

        doPrint(new Printable() { // Οι ανώνυμες κλάσεις δεν είναι εύχρηστες λόγω μεγέθους
            @Override
            public void print() {
                System.out.println("Hello World");
            }
        });

        doPrint(new Printable() {
            @Override
            public void print() {
                System.out.println("Hello coding");
            }
        });
    }


    public static void doPrint(Printable printable){
        printable.print();

    }
}
