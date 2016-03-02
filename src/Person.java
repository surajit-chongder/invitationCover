import java.util.Objects;

public class Person {
    private final String firstName, secondName, gender;

    public Person(String firstName, String surName, String gender) {
        this.firstName = firstName;
        this.secondName = surName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String genderRepresentation() {
        return Objects.equals(this.gender, "Male") ? "Mr" : "Ms";
    }
}
