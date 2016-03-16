package entities;

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

    public String getNameFormat(Formator nameFormat){
        return name.getFormat(nameFormat,gender);
    }

    public boolean isSameCountry(String country) {
        return address.isSameCountry(country);
    }

    public boolean isOlder(int age) {
        return this.age.isOlder(age);
    }

    public boolean isFirstNameFirstGreaterThanAddress() {
        return getNameFormat(new FirstFirstFormat()).length() > getLengthOfAddress();
    }

    public boolean isLastNameFirstGreaterThanAddress() {
        return getNameFormat(new LastFirstFormat()).length() > getLengthOfAddress();
    }

    public int getLengthOfAddress() {
        if (representCountry().length() > address.stateAndCityRepresentation().length())
            return representCountry().length();
        return address.stateAndCityRepresentation().length();
    }

    public String representCityAndState() {
        return address.stateAndCityRepresentation();
    }

    public String representCountry() {
        return address.getCountryName();
    }

}
