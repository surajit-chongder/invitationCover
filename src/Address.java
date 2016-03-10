public class Address {
    String city;
    String state;
    String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return country;
    }

    public boolean isSameCountry(String country) {
        return java.util.Objects.equals(this.country,country);
    }
}