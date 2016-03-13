package guestManipulationTest;

import entities.*;
import guestManipulation.Filter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FilterTest {
    List<Person> guests = new ArrayList<>();
    Person person1;
    Person person2;
    @Before
    public void setUp() throws Exception {

        Name name1 = new Name("Julius", "Barrows");
        Gender female = Gender.valueOf("Female");
        Age age1 = new Age(18);
        Address address1 = new Address("Veda haven", "Vermont", "Macedonia");
        person1 = new Person(name1, female, age1, address1);

        Name name2 = new Name("Ram", "Raj");
        Gender male = Gender.valueOf("Male");
        Age age2 = new Age(23);
        Address address2 = new Address("Veda haven", "Vermont", "Bangladesh");
        person2 = new Person(name2, male, age2, address2);

        guests.add(person1);
        guests.add(person2);

    }

    @Test
    public void test_filteringByCountry_give_list_of_same_country() throws Exception {
        List<Person> expected = new ArrayList<>();
        expected.add(person1);
        Filter filter = new Filter(guests);
        Assert.assertEquals(expected,filter.filteringByCountry("Macedonia"));
    }

    @Test
    public void test_filteringByCountry_give_list_of_above_the_age_limit() throws Exception {
        List<Person> expected = new ArrayList<>();
        expected.add(person2);
        Filter filter = new Filter(guests);
        Assert.assertEquals(expected,filter.filteringByAboveAge(19));
    }
}
