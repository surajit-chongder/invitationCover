package entities;

import java.util.Objects;

public class Address {
    private final City city;
    private final State state;
    private final Country country;

    public Address(City city, State state, Country country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getCountryName() {
        return "" + country;
    }

    public boolean isSameCountry(String country) {
        return this.country.isSameCountry(country);
    }

    public String addressRepresentation() {
        return String.format("%s, %s", city, state);
    }
}