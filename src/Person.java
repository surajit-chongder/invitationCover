import java.util.Objects;

public class Person {
    private final String firstName, secondName, gender;

    public Person(String firstName, String surName, String gender) {
        this.firstName = firstName;
        this.secondName = surName;
        this.gender = gender;
    }

    public Gender genderRepresentation() {
        return Objects.equals(this.gender, "Male") ? Gender.Male : Gender.Female;
    }

    public String toString(String delimiter) {
        return genderRepresentation() + " " + secondName + delimiter + firstName;
    }

    @Override
    public String toString() {
        return genderRepresentation() + " " + firstName + " " + secondName;
    }
}
