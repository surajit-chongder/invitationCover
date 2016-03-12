import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OptionHandlerTest {
    private List<Person> label = new ArrayList<>();
    private List<Person> guests= new ArrayList<>();
    Person person1;
    Person person2;

    @Before
    public void setUp() throws Exception {
        Name name1 = new Name("Melody", "Dooley");
        Gender female = Gender.valueOf("Female");
        Age age1 = new Age(31);
        Address address1 = new Address("West Shanna", "Vermont", "Bangladesh");
        person1 = new Person(name1, female, age1, address1);
        guests.add(person1);

        Name name2 = new Name("Ram", "Raj");
        Gender male = Gender.valueOf("Male");
        Age age2 = new Age(20);
        Address address2 = new Address("West", "San", "Qatar");
        person2 = new Person(name2, male, age2, address2);
        guests.add(person2);

    }

    @Test
    public void test_guestList_gives_only_firstFirst_guest_name() throws Exception {
        label.add(person1);
        label.add(person2);
        String[] args = {"--firstFirst","--file","records"};
        OptionHandler handler = new OptionHandler(args, guests);
        Assert.assertEquals(label,handler.guestList());
    }
    @Test
    public void test_guestList_gives_only_Bangladesh_guest_name() throws Exception {
        label.add(person1);
        String[] args = {"--firstFirst","--country","Bangladesh","--file","records"};
        OptionHandler handler = new OptionHandler(args, guests);
        Assert.assertEquals(label,handler.guestList());
    }
    @Test
    public void test_guestList_gives_only_Qatar_guest_name() throws Exception {
        label.add(person2);
        String[] args = {"--firstFirst","--country","Qatar","--file","records"};
        OptionHandler handler = new OptionHandler(args, guests);
        Assert.assertEquals(label,handler.guestList());
    }

    @Test
    public void test_guestList_gives_only_above_30_individual_country() throws Exception {
        label.add(person1);
        String[] args = {"--firstFirst","--country","Bangladesh","--file","records","--ageAbove","30"};
        OptionHandler handler = new OptionHandler(args, guests);
        Assert.assertEquals(label,handler.guestList());
    }
}
