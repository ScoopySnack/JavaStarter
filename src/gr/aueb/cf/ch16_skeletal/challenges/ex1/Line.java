package gr.aueb.cf.ch16_skeletal.challenges.ex1;

public class Line extends AbstractShape{
    private double length;

    public Line(double length) {
        this.length = length;
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
}
