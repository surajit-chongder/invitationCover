import java.util.Objects;

public class Address {
    String city;
    String state;
    String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getCountry() {
        return ""+country;
    }

    public boolean isSameCountry(String country) {
        return Objects.equals(this.country, country);
    }

    public String addressRepresentation(){
        return String.format("%s, %s",city,state);
    }
}