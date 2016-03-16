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
        City city = new City("West Shanna");
        State state = new State("Vermont");
        Country country = new Country("Bangladesh");
        Address address1 = new Address(city, state, country);
        person1 = new Person(name1, female, age1, address1);

        guests.add(person1);

    }
    @Test
    public void test_PersonGeneratorTest_should_generate_the_person() throws Exception {
        PersonGenerator generator = new PersonGenerator(list);
        String expected = guests.get(0).getNameFormat(new FirstFirstFormat());
        String result = generator.generatePerson().get(0).getNameFormat(new FirstFirstFormat());
        Assert.assertEquals(expected,result);

    }
}
