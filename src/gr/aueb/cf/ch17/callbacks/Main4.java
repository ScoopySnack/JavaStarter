package gr.aueb.cf.ch17.callbacks;

/**
 * Επειδή οι παράμετροι εισόδου ταιριάζουν με τις παραμέτρους της μεθόδου,
 * μπορούν να εννοηθούν έμμεσα και να χρησιμοποιήσουμε μία συντακτική μορφή που ονομάζεται method reference
 */
public class Main4 {

    public static void main(String[] args) {
        doPrint(Main4::sayHelloW);  //:: -> τελεστής εμβέλειας

        doPrint(Main4::sayHelloC);
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
