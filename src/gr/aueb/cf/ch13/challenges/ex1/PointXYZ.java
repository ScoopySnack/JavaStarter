package gr.aueb.cf.ch13.challenges.ex1;

/**
 * PointXYZ class represents a point in 3D space. It has three fields x, y, z that represent the coordinates of the point.
 * It has methods to calculate the distance of the point from the origin, the distance of the point from the XY, YZ,
 * XZ planes and the distance of the point from the origin.
 */
public class PointXYZ {
    private double x;
    private double y;
    private double z;

    public PointXYZ() {
    }

    public PointXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getXYDistance() {
        return Math.sqrt(x * x + y * y);
    }

    public double getYZDistance() {
        return Math.sqrt(y * y + z * z);
    }

    public double getXZDistance() {
        return Math.sqrt(x * x + z * z);
    }

    public double getXYZDistance() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public String convertToString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

}
