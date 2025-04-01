package gr.aueb.cf.ch17_nestedClasses.challenges.ex1;

public class Rectangle extends AbstractShape implements ITwoDimensional, Cloneable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Copy constructor
    public Rectangle(Rectangle rectangle) {
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    //Equals -> class that shows if two objects are equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle rectangle)) return false;
        return Double.compare(getWidth(), rectangle.getWidth()) == 0 && Double.compare(getHeight(), rectangle.getHeight()) == 0;
    }

    //hashCode is the process of converting an object into an integer value
    @Override
    public int hashCode() {
        return Double.hashCode(width) + Double.hashCode(height);
    }

    //clone -> method that creates a new object with the same values as the original object
    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}
