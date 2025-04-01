package gr.aueb.cf.ch17_nestedClasses.challenges.ex1;

public class Line extends AbstractShape implements Cloneable {
    private double length;

    public Line(double length) {
        this.length = length;
    }

    // Copy constructor
    public Line(Line line) {
        this.length = line.length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public long setId() {
        return super.setId();
    }

    @Override
    public long getId() {
        return super.getId();
    }

    //Equals -> class that shows if two objects are equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line line)) return false;
        return Double.compare(getLength(), line.getLength()) == 0;
    }

    //hashCode is the process of converting an object into an integer value
    @Override
    public int hashCode() {
        return Double.hashCode(length);
    }

    //clone -> method that creates a new object with the same values as the original object
    @Override
    public Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }
}
