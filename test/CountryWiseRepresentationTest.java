import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CountryWiseRepresentationTest {
    @Test
    public void test_representation_give_string_firstNameFirst_representation_when_firstNameFirst_given() throws Exception {
        List<ArrayList<String>> list1 = new ArrayList<>();
        List<PersonDetails> person = new ArrayList<>();
        List<String> expected = new ArrayList<>();


        String recordString2 = "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh";
        ArrayList<String> personList2 = new ArrayList<>();
        String[] splitData2 = recordString2.split(",");
        Collections.addAll(personList2, splitData2);
        list1.add(personList2);

        person.add(new PersonDetails("Melody","Dooley","Female","31","West Shanna","Vermont","Bangladesh"));
        expected.add("Ms Melody Dooley,Bangladesh,31");

        HashMap<String,List> personsHash = new HashMap<>();
        personsHash.put("Bangladesh",list1);

        CountryWiseRepresentation personAgeRepresent = new CountryWiseRepresentation(personsHash);
        Assert.assertEquals(expected,personAgeRepresent.representation(person,"firstNameFirst"));

    }
    @Test
    public void test_representation_give_string_lastNameFirst_representation_when_lastNameFirst_given() throws Exception {
        List<ArrayList<String>> list1 = new ArrayList<>();
        List<PersonDetails> person = new ArrayList<>();
        List<String> expected = new ArrayList<>();


        String recordString2 = "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh";
        ArrayList<String> personList2 = new ArrayList<>();
        String[] splitData2 = recordString2.split(",");
        Collections.addAll(personList2, splitData2);
        list1.add(personList2);

        person.add(new PersonDetails("Melody","Dooley","Female","31","West Shanna","Vermont","Bangladesh"));
        expected.add("Ms Dooley,Melody,Bangladesh,31");

        HashMap<String,List> personsHash = new HashMap<>();
        personsHash.put("Bangladesh",list1);

        CountryWiseRepresentation personAgeRepresent = new CountryWiseRepresentation(personsHash);
        Assert.assertEquals(expected,personAgeRepresent.representation(person,"lastNameFirst"));

    }
}
