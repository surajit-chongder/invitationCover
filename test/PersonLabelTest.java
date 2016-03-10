import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonLabelTest {
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
    public void test_representation_firstFirst_give_list_of_representation() throws Exception {
        List<String> expected = new ArrayList<>();
        expected.add("Ms Julius Barrows");
        expected.add("Mr Ram Raj");
        PersonLabel guest = new PersonLabel("--firstFirst",guests);
        Assert.assertEquals(expected,guest.representation());
    }
    @Test
    public void test_representation_lastFirst_give_list_of_representation() throws Exception {
        List<String> expected = new ArrayList<>();
        expected.add("Ms Barrows,Julius");
        expected.add("Mr Raj,Ram");
        PersonLabel guest = new PersonLabel("--lastFirst",guests);
        Assert.assertEquals(expected,guest.representation());
    }
}
