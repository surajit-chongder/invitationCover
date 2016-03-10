import java.util.ArrayList;
import java.util.List;

public class Filter {
    private final List<Person> guests;

    public Filter(List<Person> guests) {
        this.guests = guests;
    }

    public List<Person> filteringByCountry(String country) {
        List<Person> guestList = new ArrayList<>();
        for (Person guest : guests) {
            if (guest.isSameCountry(country))
                guestList.add(guest);
        }
        return guestList;
    }

    public List<Person> filteringByAboveAge(int age) {
        List<Person> guestList = new ArrayList<>();
        for (Person guest : guests) {
            if (guest.isOlder(age))
                guestList.add(guest);
        }
        return guestList;
    }
}
