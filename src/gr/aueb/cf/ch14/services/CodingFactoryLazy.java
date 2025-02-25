package gr.aueb.cf.ch14.services;

public class CodingFactoryLazy {

    //Here we do not use final keyword, because we want to change the value of INSTANCE later.
    private static CodingFactoryLazy INSTANCE = null;

    private CodingFactoryLazy(){

    }

    //Lazy instantiation, the instance is created only when it is needed
    public static CodingFactoryLazy getInstance(){
        if (INSTANCE == null){
            INSTANCE = new CodingFactoryLazy();

        }
        return INSTANCE;
    }

    public void sayHello(){
        System.out.println("Hello World");
    }
}
