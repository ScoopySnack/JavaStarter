package gr.aueb.cf.ch14_classes;

public class Circle extends Shape{

    public Circle(){
        super();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
