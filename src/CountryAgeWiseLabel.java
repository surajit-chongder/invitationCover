import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class CountryAgeWiseLabel {
    private final List guests;
    private final String method,country,age,requireDrinkMethod;
    public CountryAgeWiseLabel(String method, String country, String age, String requireDrinkMethod, String fileName) throws IOException {
        this.guests = new ReadRecords(fileName).readGuest();
        this.method = method;
        this.country = country;
        this.age = age;
        this.requireDrinkMethod = requireDrinkMethod;
    }
    public List allGuests(){
        CountryWiseList my = new CountryWiseList(guests);
        HashMap countryHast = my.mappingCountryGuest();
        CountryWiseRepresentation countryGuest = new CountryWiseRepresentation(countryHast);
        List guestList = countryGuest.countryRepresentation(country,age,requireDrinkMethod);
        return countryGuest.representation(guestList,method);
    }
}
