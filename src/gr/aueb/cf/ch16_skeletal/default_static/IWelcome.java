package gr.aueb.cf.ch16_skeletal.default_static;

/**
 * From Java 8, interfaces can have static and default methods.
 * Static methods are not inherited by implementing classes. They can be called only by the interface name.
 * Default methods are inherited by implementing classes. They can be overridden.
 * From Java 9, interfaces can have private methods.
 */
public interface IWelcome {

    static void staticMethod() {
        System.out.println("Hello from IWelcome static method!");
    }

    default void defaultMethod() {
        System.out.println("Hello from IWelcome!");
    }
}
