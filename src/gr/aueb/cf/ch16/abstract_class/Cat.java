package gr.aueb.cf.ch16.abstract_class;

public class Cat extends Animal{

//    public Cat(){  // This is not needed, as the default constructor is provided by the superclass
//        super();
//    }

    @Override
    public String toString() {
        return getId() + ", " + getName();
    }

    @Override
    public void speak() {
        System.out.println("niaou");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("... ate all the food");
    }
}
