import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GuestRepresentation {
    private HashMap allGuest;

    public GuestRepresentation(HashMap allGuest) {
        this.allGuest = allGuest;
    }

    public List countryRepresentation(String key) {
        List countryGuest = (List) allGuest.get(key);
        List<PersonDetails> guest = new ArrayList<>();
        for (Object aCountryGuest : countryGuest) {
            List each = (List) aCountryGuest;
            String firstName = (String) each.get(0);
            String secondName = (String) each.get(1);
            String gender = (String) each.get(2);
            String age = (String) each.get(3);
            String city = (String) each.get(4);
            String state = (String) each.get(5);
            String country = (String) each.get(6);
            PersonDetails eachPerson = new PersonDetails(firstName, secondName, gender, age, city, state, country);
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

