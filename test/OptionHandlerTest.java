import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OptionHandlerTest {
    private List<String> label = new ArrayList<>();
    private List<Person> guests= new ArrayList<>();
    Person person1;

    @Before
    public void setUp() throws Exception {
        Name name1 = new Name("Melody", "Dooley");
        Gender female = Gender.valueOf("Female");
        Age age1 = new Age(31);
        Address address1 = new Address("West Shanna", "Vermont", "Bangladesh");
        person1 = new Person(name1, female, age1, address1);
        guests.add(person1);

    }

    @Test
    public void test_guestList_gives_only_firstFirst_guest_name() throws Exception {
        label.add(person1.getFirstNameFirst());
        String[] args = {"--firstFirst","--file","records"};
        OptionHandler handler = new OptionHandler(args, guests);
        Assert.assertEquals(label,handler.guestList());
    }
    @Test
    public void test_guestList_gives_only_firstFirst_country_name_guest_name() throws Exception {
        label.add(person1.getFirstNameFirstCountryWise());
        String[] args = {"--firstFirst","--country","Bangladesh","--file","records"};
        OptionHandler handler = new OptionHandler(args, guests);
        Assert.assertEquals(label,handler.guestList());
    }
    @Test
    public void test_guestList_gives_only_firstFirst_country_name_guest_name_age_given() throws Exception {
        label.add(person1.getFirstNameFirstCountryAgeWise());
        String[] args = {"--firstFirst","--country","Bangladesh","--file","records","--age","30"};
        OptionHandler handler = new OptionHandler(args, guests);
        Assert.assertEquals(label,handler.guestList());
    }
}
