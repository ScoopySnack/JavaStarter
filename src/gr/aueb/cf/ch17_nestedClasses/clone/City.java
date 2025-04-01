package gr.aueb.cf.ch17_nestedClasses.clone;

public class City implements Cloneable{
    private String description;

    public City() {
    }

    public City(String description) {
        this.description = description;
    }

    //Copy constructor-Deep copy -> most used
    public City(City city) {
        this.description = city.description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "City{" +
                "description='" + description + '\'' +
                '}';
    }

    @Override
    protected City clone() throws CloneNotSupportedException {
        return (City)super.clone();
    }
}
