public class Name {
    private final String firstName, secondName;

    public Name(String firstName, String surName) {
        this.firstName = firstName;
        this.secondName = surName;
    }

    public String toString(String delimiter) {
        return secondName + delimiter +" "+ firstName;
    }

    @Override
    public String toString() {
        return firstName + " " + secondName;
    }
}
