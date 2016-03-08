import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PersonWiseRepresentationTest {
    @Test
    public void test_representation_give_string_firstNameFirst_representation_when_firstNameFirst_given() throws Exception {
        List<ArrayList<String>> list1 = new ArrayList<>();
        List<Person> person = new ArrayList<>();
        List<String> expected = new ArrayList<>();


        String recordString2 = "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh";
        ArrayList<String> personList2 = new ArrayList<>();
        String[] splitData2 = recordString2.split(",");
        Collections.addAll(personList2, splitData2);
        list1.add(personList2);

        person.add(new Person("Melody","Dooley","Female"));
        expected.add("Ms Melody Dooley");

        HashMap<String,List> personsHash = new HashMap<>();
        personsHash.put("Bangladesh",list1);

        PersonWiseRepresentation personRepresent = new PersonWiseRepresentation(personsHash);
        Assert.assertEquals(expected,personRepresent.representation(person,"firstNameFirst"));

    }
    @Test
    public void test_representation_give_string_lastNameFirst_representation_when_lastNameFirst_given() throws Exception {
        List<ArrayList<String>> list1 = new ArrayList<>();
        List<Person> person = new ArrayList<>();
        List<String> expected = new ArrayList<>();


        String recordString2 = "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh";
        ArrayList<String> personList2 = new ArrayList<>();
        String[] splitData2 = recordString2.split(",");
        Collections.addAll(personList2, splitData2);
        list1.add(personList2);

        person.add(new Person("Melody","Dooley","Female"));
        expected.add("Ms Dooley,Melody");

        HashMap<String,List> personsHash = new HashMap<>();
        personsHash.put("Bangladesh",list1);

        PersonWiseRepresentation personRepresent = new PersonWiseRepresentation(personsHash);
        Assert.assertEquals(expected,personRepresent.representation(person,"lastNameFirst"));

    }

//    @Test
    public void test_personRepresentation_give_list_of_persons() throws Exception {
        List<ArrayList<String>> list1 = new ArrayList<>();
        List<Person> list2 = new ArrayList<>();


        String recordString2 = "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh";
        ArrayList<String> personList2 = new ArrayList<>();
        String[] splitData2 = recordString2.split(",");
        Collections.addAll(personList2, splitData2);
        list1.add(personList2);

        list2.add(new Person("Melody","Dooley","Female"));

        HashMap<String,List> personsHash = new HashMap<>();
        personsHash.put("Bangladesh",list1);

        PersonWiseRepresentation person = new PersonWiseRepresentation(personsHash);
        Assert.assertEquals(list2,person.personRepresentation());

    }
}
