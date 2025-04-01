package gr.aueb.cf.ch7_strings;

public class IndexOfSubstringsApp {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o"); // 1
        int positionOfSecondo = cf.indexOf("o",2);
        int lastPositionOfo = cf.lastIndexOf("o");

        String cf2 = cf.substring(1); // "oding Factory"
        String slice = cf.substring(1,3); //od

    }
}