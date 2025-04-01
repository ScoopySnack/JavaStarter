package gr.aueb.cf.ch14_classes.immutable;

public class Point3DImmutable extends ImmutablePoint{
    private final ImmutablePoint immutablePoint;
    private final int z;

    public Point3DImmutable() {
        immutablePoint = new ImmutablePoint();
        z = 0;
    }

    public Point3DImmutable(ImmutablePoint immutablePoint, int z) {
        this.immutablePoint = immutablePoint;
        this.z = z;
    }

    public ImmutablePoint getImmutablePoint() {
        return immutablePoint;
    }

    public int getZ() {
        return z;
    }

    //We don't need setters because the class is immutable
}
