package gr.aueb.cf.ch2.challenges2;

import java.util.Scanner;

/**
 * Calculates price with vat 24%.
 */
public class PriceWithVat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inPrice;
        double vat;
        double priceWithVat;
        final double VAT_RATE = 0.24;

        System.out.println("Please insert the price before vat:");
        inPrice = sc.nextDouble();
        vat = inPrice * VAT_RATE;
        priceWithVat = inPrice + vat;

        System.out.printf("Price: %.2f, Vat: %.2f, Price with vat: %.2f", inPrice, vat, priceWithVat);
    }
}
