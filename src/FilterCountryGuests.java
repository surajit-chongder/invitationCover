import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FilterCountryGuests {
    private HashMap guests;
    public FilterCountryGuests(HashMap countryHast) {
        this.guests = countryHast;
    }

    public List countryGuests(String country) {
        List countryGuest = (List) guests.get(country);
        List<Person> guest = new ArrayList<>();
        giveProperty(guest, countryGuest);
        return guest;
    }

    private void giveProperty(List<Person> initialList, List guestList) {
        for (Object aCountryGuest : guestList) {
            List each = (List) aCountryGuest;
            Name name = new Name((String) each.get(0),(String) each.get(1));
            Gender gender = Gender.valueOf((String) each.get(2));
            int personAge = Integer.parseInt((String) each.get(3));
            Age age = new Age(personAge);
            Address address = new Address((String) each.get(4),(String) each.get(5),(String) each.get(6));
            Person eachPerson = new Person(name, gender, age, address);
            initialList.add(eachPerson);
        }
    }
    public List representation(List guestList, String method) {
        List<String> allGuestList = new ArrayList<>();
        for (Object aGuest : guestList) {
            Person each = (Person) aGuest;
            if (method.equals("firstNameFirst")) {
                allGuestList.add(each.getFirstNameFirstCountryWise());
            }
            if (method.equals("lastNameFirst")) {
                allGuestList.add(each.getSecondNameFirstCountryWise());
            }
        }
        return allGuestList;
    }
}
