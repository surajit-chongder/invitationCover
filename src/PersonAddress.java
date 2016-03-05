public class PersonAddress {
    String city;
    String state;
    String country;

    public PersonAddress(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return country;
    }
}
