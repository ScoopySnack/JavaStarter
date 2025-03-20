package gr.aueb.cf.ch17.knight;

public class KnightMain {

    private static final Runnable joa = new Knight("Joa");
    private static final Runnable whiteKnight = new Knight("White-Knight");
    private static final Runnable saintGeorge = new Knight("Saint George");

    public static void main(String[] args) {
        (new Thread(joa)).start();
        (new Thread(whiteKnight)).start();
        (new Thread(saintGeorge)).start();


    }
}
