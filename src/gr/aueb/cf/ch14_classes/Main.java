package gr.aueb.cf.ch14_classes;

import gr.aueb.cf.ch14_classes.model.Point;
import gr.aueb.cf.ch14_classes.model.Teacher;
import gr.aueb.cf.ch14_classes.services.CodingFactorySingleton;
import gr.aueb.cf.ch14_classes.services.HelloUtil;

/**
 * Main injects the necessary classes and methods to demonstrate the use of the project.
 */

public class Main {

    public static void main(String[] args) {
        // Create 3 teacher instances
        Teacher teacher1 = new Teacher(1, "Ath", "Androutsos" );
        Teacher teacher2 = new Teacher(2, "A.", "Gianoutsou");
        Teacher teacher3 =new Teacher(3, "C.", "Papadopoulos" );

        HelloUtil.sayHello();

        Point p1 = Point.getInstance();
        Point p2 = Point.getRandomPoint();

        CodingFactorySingleton cf1;
        cf1 = CodingFactorySingleton.getInstance();
        CodingFactorySingleton cf2 = CodingFactorySingleton.getInstance();

        System.out.println(cf1); // cf1 and cf2 are the same object
        System.out.println(cf2);
    }

}
