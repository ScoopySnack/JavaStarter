package gr.aueb.cf.ch2_integers;

/**
 * X=10
 * Y=85
 * D=30
 * Jumps = 3
 * 10 + 30 = 40
 * 40 + 30 = 70
 * 70 + 30 =100
 *
 */
public class FogJumpsApp {

    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int hop = 30;
        int jumps;

        jumps = (int)Math.ceil((target - start) / (double)hop);


        System.out.println("Jumps: " + jumps);
    }
}
