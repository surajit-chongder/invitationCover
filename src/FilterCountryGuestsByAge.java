import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FilterCountryGuestsByAge {
    private HashMap allGuest;

    public FilterCountryGuestsByAge(HashMap allGuest) {
        this.allGuest = allGuest;
    }

    public List filteringCountryAgeGuests(String key, String age) {
        int requireAge = Integer.parseInt(age);
        List countryGuest = (List) allGuest.get(key);
        List guests = new FilterAge(requireAge).filterAboveRequireAge(countryGuest);
        List<Person> guest = new ArrayList<>();
        giveProperty(guest, guests);
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

    public List representation(List guest, String method) {
        List<String> allGuestList = new ArrayList<>();
        for (Object aGuest : guest) {
            Person each = (Person) aGuest;
            if (method.equals("firstNameFirst")) {
                allGuestList.add(each.getFirstNameFirstCountryAgeWise());
            }
            if (method.equals("lastNameFirst")) {
                allGuestList.add(each.getSecondNameFirstCountryAgeWise());
            }
        }
        return allGuestList;
    }

}
