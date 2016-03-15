package entities;

public class City {
    private final String city;

    public City(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return String.valueOf(city);
    }
}
