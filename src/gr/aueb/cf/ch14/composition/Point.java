package gr.aueb.cf.ch14.composition;

public class Point {
    private double x;

    public Point() {

    }

    public Point(double x) {
        this.x = x;
    }

    public double getX() {

        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + x + ")";
    }


    public void movePlus10() {
        x += 10;
    }

    private void reset() {
        x = 0;
    }

    //Για να μπορεί να κληρονομηθεί από private γίνεται protected. Αυτό παραβιάζει την αρχή της ενθυλάκωσης.
    //Γίνεται μέρος του public API για τις κλάσεις που κληρονομούν την Point.
    protected void movePlusOne() {
        x += 1;
    }
}
