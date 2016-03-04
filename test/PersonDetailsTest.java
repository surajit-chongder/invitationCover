import org.junit.Assert;
import org.junit.Test;


public class PersonDetailsTest {
    @Test
    public void test_secondNameRepresentation_represent_guest_name_for_female() throws Exception {
        PersonDetails personDetails = new PersonDetails("Julius", "Barrows", "Female", "18", "Veda haven", "Vermont", "Macedonia");
        Assert.assertEquals("Ms Barrows,Julius Macedonia", personDetails.secondNameRepresentation());
    }

    @Test
    public void test_simpleRepresentation_represent_guest_name_for_male() throws Exception {
        PersonDetails personDetails = new PersonDetails("Gavin", "Hyatt", "Male", "22", "West Shanna", "Vermont", "Bangladesh");
        Assert.assertEquals("Mr Gavin Hyatt Bangladesh", personDetails.simpleRepresentation());
    }

    @Test
    public void test_simpleRepresentation_represent_guest_name_for_female() throws Exception {
        PersonDetails personDetails = new PersonDetails("Julius", "Barrows", "Female", "18", "Veda haven", "Vermont", "Macedonia");
        Assert.assertEquals("Ms Julius Barrows Macedonia", personDetails.simpleRepresentation());
    }

    @Test
    public void test_secondNameRepresentation_represent_guest_name_for_male() throws Exception {
        PersonDetails personDetails = new PersonDetails("Gavin", "Hyatt", "Male", "22", "West Shanna", "Vermont", "Bangladesh");
        Assert.assertEquals("Mr Hyatt,Gavin Bangladesh", personDetails.secondNameRepresentation());
    }
}