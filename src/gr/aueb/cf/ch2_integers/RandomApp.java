package gr.aueb.cf.ch2_integers;

/**
 * Random demo.
 * Random gives a random double no in range [0-1) -> 0-0.99
 * The example shows a die roll
 */
public class RandomApp {
    public static void main(String[] args) {
        int die = (int) (Math.random() * 6) +1;
        System.out.println(die);
    }
}
