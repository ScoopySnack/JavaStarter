package gr.aueb.cf.ch2_integers;

public class DateApp {
    public static void main(String[] args) {
        int day = 8;
        int month = 7;
        int year = 2024;

        System.out.println("Η ημερομινία είναι: " + day + "/" + month + "/" + year );
        System.out.printf("Ηημερομηνία είναι: %02d/%02d/%d", day, month, year); //%02d->left padding (place holder)

    }
}
