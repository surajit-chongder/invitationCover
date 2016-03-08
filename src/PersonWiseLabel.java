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
        CountryWiseList my = new CountryWiseList(guests);
        HashMap countryHast = my.mappingCountryGuest();
        PersonRepresentation personRepresentation = new PersonRepresentation(countryHast);
        List guestList = personRepresentation.personRepresentation();
        return personRepresentation.representation(guestList,method);
    }
}
