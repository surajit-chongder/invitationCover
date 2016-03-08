import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountryRepresentation {
    private HashMap guests;
    public CountryRepresentation(HashMap countryHast) {
        this.guests = countryHast;
    }

    public List countryGuests(String country) {
        List countryGuest = (List) guests.get(country);
        List<PersonDetails> guest = new ArrayList<>();
        giveProperty(guest, countryGuest);
        return guest;
    }

    private void giveProperty(List<PersonDetails> initialList, List guestList) {
        for (Object aCountryGuest : guestList) {
            List each = (List) aCountryGuest;
            String firstName = (String) each.get(0);
            String secondName = (String) each.get(1);
            String gender = (String) each.get(2);
            String age = (String) each.get(3);
            String city = (String) each.get(4);
            String state = (String) each.get(5);
            String country = (String) each.get(6);
            PersonDetails eachPerson = new PersonDetails(firstName, secondName, gender, age, city, state, country);
            initialList.add(eachPerson);
        }
    }
    public List representation(List guestList, String method) {
        List<String> allGuestList = new ArrayList<>();
        for (Object aGuest : guestList) {
            PersonDetails each = (PersonDetails) aGuest;
            if (method.equals("firstNameFirst")) {
                allGuestList.add(each.firstNameFirstCountryWise());
            }
            if (method.equals("lastNameFirst")) {
                allGuestList.add(each.secondNameFirstCountryWise());
            }
        }
        return allGuestList;
    }
}
