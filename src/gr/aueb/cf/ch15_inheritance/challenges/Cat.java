package gr.aueb.cf.ch15_inheritance.challenges;

public class Cat extends Animal{

//    public Cat() {
//    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("I am a cat");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
