package entities;

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
        return String.valueOf(country);
    }

    public boolean isSameCountry(String country) {
        return this.country.isSameCountry(country);
    }

    public String stateAndCityRepresentation() {
        return String.format("%s, %s", city, state);
    }
}