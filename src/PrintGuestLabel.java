import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class PrintGuestLabel {
    public static void main(String[] args) throws IOException {
        List guest = new ReadRecords(args[2]).readGuest();
        CountryWiseList my = new CountryWiseList(guest);
        HashMap countryHast = my.mappingCountryGuest();
        GuestRepresentation countryGuest = new GuestRepresentation(countryHast);
        List guestList = countryGuest.countryRepresentation(args[1]);
        List printList = countryGuest.representation(guestList,args[0]);
        for (Object aPrintList : printList) {
            System.out.println(aPrintList);
        }
    }
}
