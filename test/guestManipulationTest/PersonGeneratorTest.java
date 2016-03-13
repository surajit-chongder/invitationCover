package guestManipulationTest;

import entities.*;
import guestManipulation.PersonGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonGeneratorTest {
    List<String> list = new ArrayList<>();
    List<Person> guests = new ArrayList<>();
    Person person1;
    @Before
    public void setUp() throws Exception {

        String record = "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh";
        list.add(record);

        Name name1 = new Name("Melody", "Dooley");
        Gender female = Gender.valueOf("Female");
        Age age1 = new Age(31);
        Address address1 = new Address("West Shanna", "Vermont", "Bangladesh");
        person1 = new Person(name1, female, age1, address1);

        guests.add(person1);

    }
    @Test
    public void test_PersonGeneratorTest_should_generate_the_person() throws Exception {
        PersonGenerator generator = new PersonGenerator(list);
        Assert.assertEquals(guests.get(0).getFirstNameFirst(),generator.generatePerson().get(0).getFirstNameFirst());

    }
}
