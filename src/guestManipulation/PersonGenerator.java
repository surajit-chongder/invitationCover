package guestManipulation;

import entities.*;

import java.util.ArrayList;
import java.util.List;

public class PersonGenerator {
    private final List<String> guestList;

    public PersonGenerator(List<String> guestList) {
        this.guestList = guestList;
    }

    public List<Person> generatePerson() {
        List<Person> guests = new ArrayList<>();
        for (String aCountryGuest : guestList) {
            String[] each = aCountryGuest.split(",");
            Name name = new Name(each[0], each[1]);
            Gender gender = Gender.valueOf(each[2]);
            int personAge = Integer.parseInt(each[3]);
            Age age = new Age(personAge);
            City city = new City(each[4]);
            State state = new State(each[5]);
            Country country = new Country(each[6]);
            Address address = new Address(city, state, country);
            Person eachPerson = new Person(name, gender, age, address);
            guests.add(eachPerson);
        }
        return guests;
    }
}
