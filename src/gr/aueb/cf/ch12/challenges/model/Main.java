package gr.aueb.cf.ch12.challenges.model;

// Practice in Java Beans, overloaded constructors, getters & setters
public class Main {

    public static void main(String[] args) {
        User user = new User(1, "Angeliki", "Nikolaou");

        UserCredentials userCredentials = new UserCredentials(1, "SkoopySnack", "123456789");

        System.out.println("User id: " + user.getId() + " first name: " + user.firstname + " last name: " + user.lastname);
        System.out.println(userCredentials.id +" " + userCredentials.username + " " + userCredentials.password);
    }
}
