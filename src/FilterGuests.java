import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class FilterGuests {
    private HashMap allGuest;

    public FilterGuests(HashMap allGuest) {
        this.allGuest = allGuest;
    }

    public List personRepresentation() {
        List<Person> allName = new ArrayList<>();
        Set keys = allGuest.keySet();
        for (Object index : keys) {
            List each = (List) allGuest.get(index);
            giveProperty(allName, each);
        }
        return allName;
    }

    private void giveProperty(List<Person> initialList, List guestList) {
        for (Object aCountryGuest : guestList) {
            List each = (List) aCountryGuest;
            Name name = new Name((String) each.get(0), (String) each.get(1));
            Gender gender = Gender.valueOf((String) each.get(2));
            int personAge = Integer.parseInt((String) each.get(3));
            Age age = new Age(personAge);
            Address address = new Address((String) each.get(4), (String) each.get(5), (String) each.get(6));
            Person eachPerson = new Person(name, gender, age, address);
            initialList.add(eachPerson);
        }
    }

    public List representation(List guest, String method) {
        List<String> allGuestList = new ArrayList<>();
        for (Object aGuest : guest) {
            Person each = (Person) aGuest;
            if (method.equals("firstNameFirst")) {
                allGuestList.add(each.firstNameFirst());
            }
            if (method.equals("lastNameFirst")) {
                allGuestList.add(each.getSecondNameFirst());
            }
        }
        return allGuestList;
    }

}


