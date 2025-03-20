package gr.aueb.cf.ch17.clone;

public class Trainee implements Cloneable {
    private String name;
    private City city;

    public Trainee() {
    }

    public Trainee(String name, City city) {
        this.name = name;
        this.city = city;
    }

    //Copy constructor-Deep copy -> most used
    public Trainee(Trainee trainee) {
        this.name = trainee.name;
        this.city = trainee.city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    //City is a mutable object, so we need to clone it as well
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
