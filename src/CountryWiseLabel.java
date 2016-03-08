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
        CountryWiseList my = new CountryWiseList(guests);
        HashMap countryHast = my.mappingCountryGuest();
        CountryRepresentation countryGuest = new CountryRepresentation(countryHast);
        List guestList = countryGuest.countryGuests(country);
        return countryGuest.representation(guestList,method);
    }
}
