package gr.aueb.cf.ch16_skeletal.challenges.ex2;

public class Rectangle extends AbstractShape implements ITwoDimensional {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(long id, double width, double height) {
        super(id);
        this.width = width;
        this.height = height;
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
    public double getArea() {
        return width * height;
    }

    @Override
    public double getCircumference() {
        return width * 2 + height * 2;
    }
}
