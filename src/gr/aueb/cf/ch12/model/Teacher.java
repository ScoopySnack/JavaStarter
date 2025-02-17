package gr.aueb.cf.ch12.model;

/**
 * POJO -Java Bean
 */
public class Teacher {
    private int id;  //πεδία
    private String firstname;
    private String lastname;

    // Default constructor
    public Teacher(){

    }

    // Overloaded constructor
    public Teacher(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
