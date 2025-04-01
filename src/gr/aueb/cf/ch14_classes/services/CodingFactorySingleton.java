package gr.aueb.cf.ch14_classes.services;

public class CodingFactorySingleton {
    //Eager policy
    private static final CodingFactorySingleton INSTANCE = new CodingFactorySingleton();

    private CodingFactorySingleton(){

    }

    //Static factory method, returns the instance of the singleton. If getInstance() is called multiple times,
    // the same instance is returned. Also is a singleton because the constructor is private and the instance is static.
    public static CodingFactorySingleton getInstance(){
        return INSTANCE;
    }


    public void sayHello(){
        System.out.println("Hello");
    }

}
