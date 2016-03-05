import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Guest {
    private HashMap allGuest;

    public Guest(HashMap allGuest) {
        this.allGuest = allGuest;
    }

    public List countryRepresentation(String key) {
        List countryGuest = (List) allGuest.get(key);
        List guest = new ArrayList();
        for (Object aCountryGuest : countryGuest) {
            List each = (List) aCountryGuest;
            String firstname = each.get(0).toString();
            String secondName = each.get(1).toString();
            String gender = each.get(2).toString();
            String age = each.get(3).toString();
            String city = each.get(4).toString();
            String state = each.get(5).toString();
            String country = each.get(6).toString();
            PersonDetails eachPerson = new PersonDetails(firstname, secondName, gender, age, city, state, country);
            guest.add(eachPerson);
        }
        return guest;
    }

    public List representation(List guest, String method) {
        List<String> allGuestList = new ArrayList<>();
        for (Object aGuest : guest) {
            PersonDetails each = (PersonDetails) aGuest;
            if (method.equals("firstNameFirst")) {
                allGuestList.add(each.simpleRepresentation());
            }
            if (method.equals("lastNameFirst")) {
                allGuestList.add(each.secondNameRepresentation());
            }
        }
        return allGuestList;
    }

}

