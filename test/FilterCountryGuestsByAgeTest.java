import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FilterCountryGuestsByAgeTest {
    List<ArrayList<String>> list = new ArrayList<>();
    List<Person> person = new ArrayList<>();
    HashMap<String, List> personsHash = new HashMap<>();
    FilterCountryGuestsByAge personAgeRepresent;

    @Before
    public void setUp() throws Exception {
        String record = "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh";
        ArrayList<String> personList = new ArrayList<>();
        String[] splitData2 = record.split(",");
        Collections.addAll(personList, splitData2);
        list.add(personList);

        Name name = new Name(splitData2[0], splitData2[1]);
        Gender gender = Gender.valueOf(splitData2[2]);
        int personAge = Integer.parseInt(splitData2[3]);
        Age age = new Age(personAge);
        Address address = new Address(splitData2[4], splitData2[5], splitData2[6]);
        Person eachPerson = new Person(name, gender, age, address);
        person.add(eachPerson);
        personsHash.put("Bangladesh", list);
        personAgeRepresent = new FilterCountryGuestsByAge(personsHash);
    }

    @Test
    public void test_representation_give_string_firstNameFirst_representation_when_firstNameFirst_given() throws Exception {
        List<String> expected = new ArrayList<>();
        expected.add("Ms Melody Dooley,Bangladesh,31");
        Assert.assertEquals(expected, personAgeRepresent.representation(person, "firstNameFirst"));
    }

    @Test
    public void test_representation_give_string_lastNameFirst_representation_when_lastNameFirst_given() throws Exception {
        List<String> expected = new ArrayList<>();
        expected.add("Ms Dooley,Melody,Bangladesh,31");
        Assert.assertEquals(expected, personAgeRepresent.representation(person, "lastNameFirst"));
    }

    @Test
    public void test_personRepresentation_give_list_of_persons() throws Exception {
        List<Person> personList= personAgeRepresent.filteringCountryAgeGuests("Bangladesh","30");
        String result = personList.get(0).firstNameFirst();
        String expected = person.get(0).firstNameFirst();
        assertEquals(result,expected);
    }
}
