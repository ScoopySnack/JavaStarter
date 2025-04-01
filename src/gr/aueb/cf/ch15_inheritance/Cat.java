package gr.aueb.cf.ch15_inheritance;

/**
 * Cat class that implements ISpeakable interface, it is not the classic case of inheritance
 */
public class Cat implements ISpeakable{
    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Meow!");
    }
}
