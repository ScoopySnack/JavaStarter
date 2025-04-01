package gr.aueb.cf.ch13_publicAPI.challenges.ex1;

/**
 * Main class of the program. It creates two PointXYZ objects and prints the distance of each point from the origin
 */
public class Main {

    public static void main(String[] args) {
        PointXYZ point1 = new PointXYZ(1, 2, 3);
        PointXYZ point2 = new PointXYZ(4, 5, 6);

        System.out.println("Distance of point1 from the origin: " + point1.getXYZDistance());
        System.out.println("Distance of point2 from the origin: " + point2.getXYZDistance());

        System.out.println("Distance of point1 between X and Y: " + point1.getXYDistance());
        System.out.println("Distance of point2 between X and Y: " + point2.getXYDistance());

        System.out.println("Distance of point1 between Y and Z: " + point1.getYZDistance());
        System.out.println("Distance of point2 between Y and Z: " + point2.getYZDistance());

        System.out.println("Distance of point1 between X and Z: " + point1.getXZDistance());
        System.out.println("Distance of point2 between X and Z: " + point2.getXZDistance());
    }
}
