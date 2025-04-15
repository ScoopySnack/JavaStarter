package gr.aueb.cf.ch20_enums_lambdas_regex.reflection;

public class Teacher {
    private Long id;
    private String firstName;
    private String lastName;

    public Teacher() {
    }

    public Teacher(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public void sayHello(){
        System.out.println("Hello, my name is " + firstName + " " + lastName);
    }

    public void saySomething(String message){
        System.out.println(message);
    }
}
