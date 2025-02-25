package gr.aueb.cf.ch14;

/**
 * Inheritance example. Point3D extends Point2D. And Point2D extends Point.
 * Point is a superclass of Point2D and Point2D is a superclass of Point3D.
 */
public class Point3D extends Point2D {
    private double z;

    public Point3D() {
//        super();    // constructor chaining, super() is called implicitly
//        z = 0;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }

    //    @Override
//    public String pointToString() {
//       // return super.pointToString() + "(" + z + ")";
//        return "(" + getX() + ", " + getY() + ", " + z + ")";
//    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        z += 10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        z += 1;
    }
}
