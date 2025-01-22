package gr.aueb.cf.ch17.callbacks;

public class Main3 {

    public static void main(String[] args) {
        doPrint(() -> sayHelloW());

        doPrint(() -> sayHelloC());
    }

    public static void doPrint(Printable printable){
        printable.print();
    }

    public static void sayHelloW(){
        System.out.println("Hello World");
    }

    public static void sayHelloC(){
        System.out.println("Hello coding");
    }
}
