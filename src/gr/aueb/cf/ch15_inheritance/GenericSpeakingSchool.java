package gr.aueb.cf.ch15_inheritance;

/**
 * Loosely coupled class, it can speak through any object that implements ISpeakable
 * Generic Speaking School -> Agnostic to the object that speaks
 * more easily testable and flexible, because we can pass a mock object that implements ISpeakable
 */
public class GenericSpeakingSchool {
    private final ISpeakable iSpeakable;

    /**
     * Dependency Injection (DI) - Inversion of Control (IoC)
     * Polymorphism example, we can pass any object that implements ISpeakable
     * @param iSpeakable  The object that implements ISpeakable
     */
    public GenericSpeakingSchool(ISpeakable iSpeakable) {
        this.iSpeakable = iSpeakable;
    }

    public void learnToSpeak(){
        iSpeakable.speak();
    }
}
