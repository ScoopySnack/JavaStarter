package gr.aueb.cf.ch8;

public class IndexOutOfBoundsException {

    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
