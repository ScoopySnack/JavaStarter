package gr.aueb.cf.ch15.challenges;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Garfield", 5);
        Dog dog = new Dog("Snoopy", 3);

        cat.speak();
        dog.speak();

        doSpeak(cat);
        doSpeak(dog);
    }

    public static void doSpeak(Animal animal) {
        animal.speak();
    }
}
