package gr.aueb.cf.ch26_networks_servlets;

public class DayTimeApp {

    public static void main(String[] args) {
        DayTimeServer server = new DayTimeServer();
        server.start();
    }

    /*
    Ο server περιμένει το client connection.
    Όταν γίνει η σύνδεση δημιουργείται ένας νέος περιγραφητής σύνδεσης που είναι ο connected descriptor.
    Ο server δημιουργεί έναν νέο buffered writer για την εγγραφή στον connected descriptor.
    Γράφει την ημερομηνία και ώρα στον connected descriptor, και κλείνει τον connected descriptor με το close().
    Μπορεί να επαναληφθεί η διαδικασία για να εξυπηρετηθούν περισσότεροι clients, αλλά κάθε φορά μόνο ένας client.
    Αν υπάρχουν περισσότερες αιτήσεις ταυτόχρονα ο πυρήνας τις βάζει στην ουρά του ServerSocket.
    Το default όριο είναι το 50, μετά το οποίο όποιο αίτημα σύνδεσης έρχεται απορρίπτεται
    (ConnectionException στην πλευρά του client)
     */
}
