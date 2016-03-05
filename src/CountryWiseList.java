import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountryWiseList {
    final List guestList;

    public CountryWiseList(List guestList){
        this.guestList = guestList;
    }

    private List createCountryGuest(String country) {
        List<List> countryList = new ArrayList<>();
        for (Object aGuestList : guestList) {
            List each = (List) aGuestList;
            if (each.get(each.size() - 1).equals(country))
                countryList.add(each);
        }
        return countryList;
    }

    public HashMap mappingCountryGuest() {
        HashMap<String, List> guests = new HashMap<>();
        for (Object aGuestList : guestList) {
            List each = (List) aGuestList;
            String eachCountry = (String) each.get(each.size() - 1);
            if (!guests.containsKey(eachCountry)) {
                guests.put(eachCountry, createCountryGuest(eachCountry));
            }
        }
        return guests;
    }

}