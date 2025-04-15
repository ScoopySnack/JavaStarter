package gr.aueb.cf.ch20_enums_lambdas_regex.lambdas;

public class Teacher {
    private int id;
    private String firstName;
    private String lastName;

    public Teacher() {
    }

    public Teacher(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "id: " + id + ", firstName: " + firstName + ", lastName: " + lastName;
    }

    public void printInstanceTeacher() {
        System.out.println("id: " + id + ", firstName: " + firstName + ", lastName: " + lastName);
    }

    public static void printStaticTeacher(Teacher teacher) {
        System.out.println("id: " + teacher.getId() + ", Firstname: " + teacher.getFirstName() +
                ", Lastname: " + teacher.getLastName());
    }
}
