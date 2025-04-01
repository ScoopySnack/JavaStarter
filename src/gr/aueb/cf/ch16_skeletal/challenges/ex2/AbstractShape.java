package gr.aueb.cf.ch16_skeletal.challenges.ex2;

public class AbstractShape implements IShape {
    private long id;

    public AbstractShape(){}

    public AbstractShape(long id) {
        this.id = id;
    }

    public long setId() {
        return id;
    }

    @Override
    public long getId() {
        return id;
    }
}
