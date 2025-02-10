package gr.aueb.cf.ch19;

/**
 * We have ClassCastException at Run-time because we are trying to cast an Object to an int.
 */
public class Main {

    public static void main(String[] args) {
        NodeObj nodeObj = new NodeObj();
        nodeObj.setItem("Coding");

        int item = (int) nodeObj.getItem();
        System.out.println(item);
    }
}
