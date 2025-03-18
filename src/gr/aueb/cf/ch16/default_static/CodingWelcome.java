package gr.aueb.cf.ch16.default_static;

public class CodingWelcome implements IWelcome{

    //Hidden static method from IWelcome
    public static void staticMethod() {
        System.out.println("static method from CodingWelcome hides IWelcome static method!");
    }

    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method from CodingWelcome!");
        IWelcome.super.defaultMethod();
    }
}
