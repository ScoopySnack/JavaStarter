package gr.aueb.cf.ch14;

/**
 * Main class to demonstrate the Dog class
 */
public class AnimalMain {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 5, "German Shepherd");
        dog.makeSound(); // Woof, Woof
        dog.searchForFood(); // Dog ate the food
        dog.wagTail(); // Wagging tail
        dog.fetch(); // Fetching
        dog.bark(); // Barking
        dog.bite(); // Biting
        dog.run(); // Running
        dog.sleep(); // Sleeping
        dog.eat(); // Eating

        // Polymorphism
        doMakeSound(dog); // Woof, Woof
        //We use polymorphism to be able to call the makeSound method for any animal. It is
        //late binding, the method that will be called will be determined at runtime.
    }


    /**
     * Method to demonstrate <strong>polymorphism</strong>
     * @param animal the animal to make sound
     */
    public static void doMakeSound(Animal animal){
        animal.makeSound();
    }
}
