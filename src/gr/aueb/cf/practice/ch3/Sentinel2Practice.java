package gr.aueb.cf.practice.ch3;

import java.util.Scanner;

public class Sentinel2Practice {

    public static void main(String[] args) {
        int positivesCount = 0;
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please insert a num");
        inputNum = scanner.nextInt();

        while ((inputNum = scanner.nextInt()) >= 0){ //Μπορούμε και να εκχωρήσουμε και να ελέγξουμε σε μια γραμμή!
            positivesCount++;
        }

        System.out.println("Positives count:" + positivesCount);
    }
}
