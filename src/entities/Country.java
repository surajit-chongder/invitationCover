package entities;

import java.util.Objects;

public class Country {
    private final String country;

    public Country(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return String.valueOf(country);
    }

    public boolean isSameCountry(String country) {
        return Objects.equals(this.country, country);
    }
}
