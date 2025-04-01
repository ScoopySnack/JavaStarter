package gr.aueb.cf.ch18_soa.mobilecontacts.model;

import java.util.Objects;

public class MobileContact extends AbstractEntity {
    private String firstname;
    private String lastname;
    private String phoneNumber;

    public MobileContact() {
    }

    public MobileContact(String firstname, String lastname, String phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "MobileContact{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
//        if (!(other instanceof MobileContact)) return false;
//        MobileContact that = (MobileContact) other;

        // In Java 17 το παρακάτω κάνει δύο πράγματα:
        // Έλεγχο αν είναι instanceof και αν ναι μετά κάνει
        // typecast (όπως κάναμε πριν τη Java 17 με τον παραπάνω κώδικα)

        if (!(other instanceof MobileContact that)) return false;
        return Objects.equals(firstname, that.firstname)
                && Objects.equals(lastname, that.lastname)
                && Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, phoneNumber);
    }
}
