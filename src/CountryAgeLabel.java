import java.util.ArrayList;
import java.util.List;

public class CountryAgeLabel {
    private String method;
    private List<Person> guests;

    public CountryAgeLabel(String method, List<Person> guests) {
        this.method = method;
        this.guests = guests;
    }
    public List<String> representation() {
        List<String> allGuestList = new ArrayList<>();
        for (Object aGuest : guests) {
            Person each = (Person) aGuest;
            if (method.equals("--firstFirst")) {
                allGuestList.add(each.getFirstNameFirstCountryAgeWise());
            }
            if (method.equals("--lastFirst")) {
                allGuestList.add(each.getSecondNameFirstCountryAgeWise());
            }
        }
        return allGuestList;
    }
}
