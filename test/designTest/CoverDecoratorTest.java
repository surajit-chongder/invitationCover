package designTest;

import design.CoverDecorator;
import entities.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CoverDecoratorTest {
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
    public void test_decoration_give_decoration_for_last_name() throws Exception {
        List<String> expected = new ArrayList<>();
        expected.add("+---------------------+");
        expected.add("| Ms Barrows, Julius  |");
        expected.add("|---------------------|");
        expected.add("| Veda haven, Vermont |");
        expected.add("| Macedonia           |");
        expected.add("+---------------------+");

        CoverDecorator coverDecorator = new CoverDecorator(person, "--lastFirst");
        Assert.assertEquals(expected,coverDecorator.decoration());
    }
    @Test
    public void test_decoration_give_decoration_for_first_name() throws Exception {
        List<String> expected = new ArrayList<>();
        expected.add("+---------------------+");
        expected.add("| Ms Julius Barrows   |");
        expected.add("|---------------------|");
        expected.add("| Veda haven, Vermont |");
        expected.add("| Macedonia           |");
        expected.add("+---------------------+");

        CoverDecorator coverDecorator = new CoverDecorator(person, "--firstFirst");
        Assert.assertEquals(expected,coverDecorator.decoration());
    }
}
