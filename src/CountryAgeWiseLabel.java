import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class CountryAgeWiseLabel {
    private final List guests;
    private final String method,country,age, requireLegality;
    public CountryAgeWiseLabel(String method, String country, String age, String requireLegality, String fileName) throws IOException {
        this.guests = new ReadRecords(fileName).readGuest();
        this.method = method;
        this.country = country;
        this.age = age;
        this.requireLegality = requireLegality;
    }
    public List allGuests(){
        CountryWiseList my = new CountryWiseList(guests);
        HashMap countryHast = my.mappingCountryGuest();
        CountryAgeWiseRepresentation countryGuest = new CountryAgeWiseRepresentation(countryHast);
        List guestList = countryGuest.countryRepresentation(country,age, requireLegality);
        return countryGuest.representation(guestList,method);
    }
}
