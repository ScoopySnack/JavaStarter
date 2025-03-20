package gr.aueb.cf.ch17.challenges.ex1;

import java.util.Objects;

public class Circle extends AbstractShape implements ITwoDimensional, Cloneable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Copy constructor
    public Circle(Circle circle) {
        this.radius = circle.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    //Equals -> class that shows if two objects are equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle circle)) return false;
        return Double.compare(getRadius(), circle.getRadius()) == 0;
    }

    //hashCode is the process of converting an object into an integer value
    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }

    //clone -> method that creates a new object with the same values as the original object
    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
}
