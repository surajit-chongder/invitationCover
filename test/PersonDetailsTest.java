import org.junit.Assert;
import org.junit.Test;


public class PersonDetailsTest {
    @Test
    public void test_secondNameRepresentation_represent_guest_name_for_female() throws Exception {
        PersonDetails personDetails = new PersonDetails("Julius","Barrows","Female","18","Veda haven","Vermont","Macedonia");
        Assert.assertEquals("Ms Barrows,Julius Macedonia", personDetails.secondNameRepresentation());
    }

    @Test
    public void test_simpleRepresentation_represent_guest_name_for_male() throws Exception {
        PersonDetails personDetails = new PersonDetails("Gavin","Hyatt","Male","36","Crooks ton","Illinois","Romania");
        Assert.assertEquals("Mr Gavin Hyatt Romania", personDetails.simpleRepresentation());
    }

    @Test
    public void test_simpleRepresentation_represent_guest_name_for_female() throws Exception {
        PersonDetails personDetails = new PersonDetails("Julius","Barrows","Female","18","Veda haven","Vermont","Macedonia");
        Assert.assertEquals("Ms Julius Barrows Macedonia", personDetails.simpleRepresentation());
    }

    @Test
    public void test_secondNameRepresentation_represent_guest_name_for_male() throws Exception {
        PersonDetails personDetails = new PersonDetails("Gavin","Hyatt","Male","36","Crooks ton","Illinois","Romania");
        Assert.assertEquals("Mr Hyatt,Gavin Romania", personDetails.secondNameRepresentation());
    }
}