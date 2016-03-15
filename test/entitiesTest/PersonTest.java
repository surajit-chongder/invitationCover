package entitiesTest;

import entities.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
    private Person person;

    @Before
    public void setUp() throws Exception {
        Name name = new Name("Julius", "Barrows");
        Gender female = Gender.valueOf("Female");
        Age age = new Age(18);
        City city = new City("Veda haven");
        State state = new State("Vermont");
        Country country = new Country("Macedonia");
        Address address = new Address(city, state, country);
        person = new Person(name, female, age, address);
    }

    @Test
    public void test_isSameCountry_give_True_if_belongs_to_same_country() throws Exception {
        Assert.assertTrue(person.isSameCountry("Macedonia"));
    }

    @Test
    public void test_isSameCountry_give_False_if_not_belongs_to_same_country() throws Exception {
        Assert.assertFalse(person.isSameCountry("Bangladesh"));
    }
    @Test
    public void test_firstNameFirst_give_first_name_representation_only() throws Exception {
        Assert.assertEquals("Ms Julius Barrows",person.getFirstNameFirst());
    }

    @Test
    public void test_secondNameFirst_give_second_name_representation_only() throws Exception {
        Assert.assertEquals("Ms Barrows, Julius",person.getSecondNameFirst());
    }

}
