import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class CountryWiseLabel {

    private final List guests;
    private final String method,country;
    public CountryWiseLabel(String method, String country, String fileName) throws IOException {
        this.guests = new ReadRecords(fileName).readGuest();
        this.method = method;
        this.country = country;
    }
    public List allGuests(){
        MapGuestsByCountry my = new MapGuestsByCountry(guests);
        HashMap countryHast = my.mappingCountryGuest();
        FilterCountryGuests countryGuest = new FilterCountryGuests(countryHast);
        List guestList = countryGuest.countryGuests(country);
        return countryGuest.representation(guestList,method);
    }
}
