package gr.aueb.cf.ch14;

public class Dog extends Animal{
    private String breed;

    public Dog(){
        super();
    }


    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound(){
        System.out.println("Woof, Woof");
    }

    @Override
    public void searchForFood() {
        super.searchForFood();
        System.out.println("Dog ate the food");
    }

    public void wagTail(){
        System.out.println("Wagging tail");
    }

    public void fetch(){
        System.out.println("Fetching");
    }

    public void bark(){
        System.out.println("Barking");
    }

    public void bite(){
        System.out.println("Biting");
    }

    public void run(){
        System.out.println("Running");
    }

    public void sleep(){
        System.out.println("Sleeping");
    }

    public void eat(){
        System.out.println("Eating");
    }

    public void drink(){
        System.out.println("Drinking");
    }

    public void play(){
        System.out.println("Playing");
    }

    public void scratch(){
        System.out.println("Scratching");
    }

    public void dig(){
        System.out.println("Digging");
    }

    public void chase(){
        System.out.println("Chasing");
    }

    public void jump(){
        System.out.println("Jumping");
    }

    public void sit(){
        System.out.println("Sitting");
    }

    public void stand(){
        System.out.println("Standing");
    }

    public void roll(){
        System.out.println("Rolling");
    }

    public void shake(){
        System.out.println("Shaking");
    }

    public void howl(){
        System.out.println("Howling");
    }

    public void growl(){
        System.out.println("Growling");
    }

    public void sniff(){
        System.out.println("Sniffing");
    }

    public void lick(){
        System.out.println("Licking");
    }

    public void pant(){
        System.out.println("Panting");
    }

    public void wag(){
        System.out.println("Wagging");
    }

    public void beg(){
        System.out.println("Begging");
    }

    public void whine(){
        System.out.println("Whining");
    }

    public void yawn(){
        System.out.println("Yawning");
    }

    public void drool(){
        System.out.println("Drooling");
    }

    public void shakeHead(){
        System.out.println("Shaking head");
    }
}
