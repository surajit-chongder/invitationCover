import java.util.Objects;

public class Person {
    private String firstName, secondName, gender;

    public Person(String firstName, String surName, String gender) {
        this.firstName = firstName;
        this.secondName = surName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return genderRepresentation() + " " + firstName + " " + secondName;
    }

    private String genderRepresentation() {
        return Objects.equals(this.gender, "Male") ? "Mr" : "Ms";
    }
}
