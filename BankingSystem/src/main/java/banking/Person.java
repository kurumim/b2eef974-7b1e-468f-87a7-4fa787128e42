package banking;

public class Person {
    private String firstName;
    private String lastName;
    private int idNumber;

    public Person(final String firstName, final String lastName, final int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }
}
