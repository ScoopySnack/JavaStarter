package gr.aueb.cf.ch18_soa.challenges.exceptions;

public class SsnNotValidException extends Exception {
    private final String ssn;

    public SsnNotValidException(String ssn) {
        super("Error: SSN " + ssn + " is not valid.");
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }
}
