package gr.aueb.cf.ch6;

public class TwoDimArrayApp {

    public static void main(String[] args) {

        //Κατά γραμμές και στήλες
        int[][] grid = new int[2][3];

        grid[0][0] = 5;
        grid[0][1] = 7;
        grid[0][2] = 10;
        grid[1][0] = 2;
        grid[2][0] = 6;
        grid[3][0] = 8;


        //traverse
        for (int[] row : grid) {
            for (int i : row) {
                System.out.print(i);
            }
        }

    }
}