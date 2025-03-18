package gr.aueb.cf.ch15;

public class Main {

    public static void main(String[] args) {

        ISpeakable Cat = new Cat("Mitsos");
        ISpeakable Dog = new Dog("Rex");
        GenericSpeakingSchool genericSpeakingSchool1 = new GenericSpeakingSchool(Cat);
        GenericSpeakingSchool genericSpeakingSchool2 = new GenericSpeakingSchool(Dog);

//        Cat.speak();
//        Dog.speak();

        doSpeak(Cat);
        doSpeak(Dog);

        genericSpeakingSchool1.learnToSpeak();
        genericSpeakingSchool2.learnToSpeak();

    }

    /**
     * Polymorphism example, we can pass any object that implements ISpeakable
     * @param iSpeakable  The object that implements ISpeakable
     */
    public static void doSpeak(ISpeakable iSpeakable){
        iSpeakable.speak();
    }
}
