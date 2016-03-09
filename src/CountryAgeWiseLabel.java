import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class CountryAgeWiseLabel {
    private final List guests;
    private final String method,country,age;
    public CountryAgeWiseLabel(String method, String country, String age, String fileName) throws IOException {
        this.guests = new ReadRecords(fileName).readGuest();
        this.method = method;
        this.country = country;
        this.age = age;
    }
    public List allGuests(){
        MapGuestsByCountry my = new MapGuestsByCountry(guests);
        HashMap countryHast = my.mappingCountryGuest();
        FilterCountryGuestsByAge countryGuest = new FilterCountryGuestsByAge(countryHast);
        List guestList = countryGuest.filteringCountryAgeGuests(country,age);
        return countryGuest.representation(guestList,method);
    }
}
