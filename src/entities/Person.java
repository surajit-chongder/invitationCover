package entities;

import entities.Address;
import entities.Age;
import entities.Name;

public class Person {
    private final Gender gender;
    private final Name name;
    private final Age age;
    private final Address address;

    public Person(Name name, Gender gender, Age age, Address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public boolean isSameCountry(String country) {
        return address.isSameCountry(country);
    }

    public boolean isOlder(int age) {
        return this.age.isOlder(age);
    }

    public String getSecondNameFirst() {
        return String.format("%s %s", gender, name.toString(","));
    }

    public String getFirstNameFirst() {
        return String.format("%s %s", gender, name.toString());
    }

    public boolean isFirstNameFirstGreaterThanAddress() {
        return getFirstNameFirst().length() > getLengthOfAddress();
    }

    public boolean isLastNameFirstGreaterThanAddress() {
        return getSecondNameFirst().length() > getLengthOfAddress();
    }

    public int getLengthOfAddress() {
        if (getCountry().length() > address.addressRepresentation().length())
            return getCountry().length();
        return address.addressRepresentation().length();
    }

    public String getAddress() {
        return address.addressRepresentation();
    }

    public String getCountry() {
        return address.getCountry();
    }

}

