import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class PersonWiseRepresentation{
    private HashMap allGuest;

    public PersonWiseRepresentation(HashMap allGuest) {
        this.allGuest = allGuest;
    }

    public List personRepresentation(){
        List<Person> allPerson = new ArrayList<>();
        Set keys = allGuest.keySet();
        for (Object index : keys) {
            List each = (List) allGuest.get(index);
            for (Object anEach : each) {
                List elements = (List) anEach;
                String firstName = (String)  elements.get(0);
                String secondName = (String)  elements.get(1);
                String gender = (String)  elements.get(2);
                Person person = new Person(firstName,secondName,gender);
                allPerson.add(person);
            }
        }
        return allPerson;
    }

    public List representation(List guest, String method) {
        List<String> allGuestList = new ArrayList<>();
        for (Object aGuest : guest) {
            Person each = (Person) aGuest;
            if (method.equals("firstNameFirst")) {
                allGuestList.add(each.toString());
            }
            if (method.equals("lastNameFirst")) {
                allGuestList.add(each.toString(","));
            }
        }
        return allGuestList;
    }

}


