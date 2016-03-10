public class Person {
    private final Gender gender;
    private final Name name;
    private final Age age;
    private final Address address;

    public Person(Name name,Gender gender, Age age, Address address) {
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


    public String getSecondNameFirstCountryAgeWise() {
        return String.format("%s %s,%s,%s",gender,name.toString(","),address.toString(),age);
    }

    public String getFirstNameFirstCountryAgeWise() {
        return String.format("%s %s,%s,%s",gender,name.toString(),address.toString(),age);
    }

    public String getSecondNameFirst() {
        return String.format("%s %s",gender,name.toString(","));
    }

    public String firstNameFirst() {
        return String.format("%s %s",gender,name.toString());
    }

    public String getSecondNameFirstCountryWise() {
        return String.format("%s %s,%s",gender,name.toString(","),address.toString());
    }

    public String getFirstNameFirstCountryWise() {
        return String.format("%s %s,%s",gender,name.toString(),address.toString());
    }
}

