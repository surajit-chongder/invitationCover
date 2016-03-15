package entities;

public class Name {
    private final String firstName, secondName;

    public Name(String firstName, String surName) {
        this.firstName = firstName;
        this.secondName = surName;
    }

    public String getLastNameFirst(String delimiter) {
        return String.format("%s%s %s",secondName,delimiter,firstName);
    }

    public String getFirstNameFirst() {
        return String.format("%s %s",firstName,secondName);
    }
}
