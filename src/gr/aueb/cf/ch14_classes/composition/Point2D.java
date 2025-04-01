package gr.aueb.cf.ch14_classes.composition;

/**
 * Composition and forwarding example. Point2D has a Point instance as a private field.
 */
public class Point2D {
    private Point point;
    private double y;

    public Point2D() {

    }

    public Point2D(Point point, double y) {
        this.point = point;
        this.y = y;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "point=" + point +
                ", y=" + y +
                '}';
    }


}
