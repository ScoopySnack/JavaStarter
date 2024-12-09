package gr.aueb.cf.ch4;

/**
 * Prints different outputs of stars
 */
public class Stars {

    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++) { //horizontal
            System.out.print("*");
        }

        for (int i = 1; i <= 10 ; i++) { //vertical
            System.out.println("*");
        }

        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i =1 ; i <=10 ; i++){ //ascending
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }


        for (int i = 1; i <= 10 ; i++) {
            for (int j =  i; j <= 10 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
