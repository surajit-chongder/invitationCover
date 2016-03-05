import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class GuestCard {
    public static void main(String[] args) throws IOException {
        List guest = new ReadGuestFile(args[0]).readGuest();
        CountryWiseList my = new CountryWiseList(guest);
        HashMap countryHast = my.mappingCountryGuest();
        Guest countryGuest = new Guest(countryHast);
        List guestList = countryGuest.countryRepresentation(args[1]);
        List printList = countryGuest.representation(guestList,args[2]);
        for (Object aPrintList : printList) {
            System.out.println(aPrintList);
        }
    }
}
