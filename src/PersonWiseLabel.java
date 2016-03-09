import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class PersonWiseLabel {
    private final List guests;
    private final String method;
    public PersonWiseLabel(String method,String fileName) throws IOException {
        this.guests = new ReadRecords(fileName).readGuest();
        this.method = method;
    }
    public List allGuests(){
        MapGuestsByCountry my = new MapGuestsByCountry(guests);
        HashMap countryHast = my.mappingCountryGuest();
        FilterGuests filterGuests = new FilterGuests(countryHast);
        List guestList = filterGuests.personRepresentation();
        return filterGuests.representation(guestList,method);
    }
}
