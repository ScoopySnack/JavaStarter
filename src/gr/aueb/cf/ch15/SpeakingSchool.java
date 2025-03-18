package gr.aueb.cf.ch15;

/**
 * Tightly coupled class, it can only speak through a Cat object
 */
public class SpeakingSchool {
    private final Cat cat = new Cat(); //Composition example

    public SpeakingSchool() {
    }

    public void learnToSpeak(){
        cat.speak();
    }
}
