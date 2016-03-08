import org.junit.Assert;
import org.junit.Test;


public class PersonTest {
    @Test
    public void test_secondNameRepresentation_represent_guest_name_for_female() throws Exception {
        Name julias = new Name("Julius", "Barrows");
        Gender female = Gender.valueOf("Female");
        Age juliasAge = new Age(18);
        Address address = new Address("Veda haven","Vermont","Macedonia");
        Person personDetails = new Person(julias,female,juliasAge,address);
        Assert.assertEquals("Ms Barrows,Julius,Macedonia,18", personDetails.getSecondNameFirstCountryAgeWise());
    }

    @Test
    public void test_simpleRepresentation_represent_guest_name_for_female() throws Exception {
        Name julias = new Name("Julius", "Barrows");
        Gender female = Gender.valueOf("Female");
        Age juliasAge = new Age(18);
        Address address = new Address("Veda haven","Vermont","Macedonia");
        Person personDetails = new Person(julias,female,juliasAge,address);
        Assert.assertEquals("Ms Julius Barrows,Macedonia,18", personDetails.getFirstNameFirstCountryAgeWise());
    }

    @Test
    public void test_simpleRepresentation_represent_guest_name_for_male() throws Exception {
        Name gavin = new Name("Gavin", "Hyatt");
        Gender male = Gender.valueOf("Male");
        Age gavinAge = new Age(36);
        Address address = new Address("Crooks ton","Illinois","Romania");
        Person personDetails = new Person(gavin,male,gavinAge,address);

        Assert.assertEquals("Mr Gavin Hyatt,Romania,36", personDetails.getFirstNameFirstCountryAgeWise());
    }

    @Test
    public void test_secondNameRepresentation_represent_guest_name_for_male() throws Exception {
        Name gavin = new Name("Gavin", "Hyatt");
        Gender male = Gender.valueOf("Male");
        Age gavinAge = new Age(36);
        Address address = new Address("Crooks ton","Illinois","Romania");
        Person personDetails = new Person(gavin,male,gavinAge,address);
        Assert.assertEquals("Mr Hyatt,Gavin,Romania,36", personDetails.getSecondNameFirstCountryAgeWise());
    }

    @Test
    public void test_firstFirst_represent_guest_name_for_female() throws Exception {
        Name julias = new Name("Julius", "Barrows");
        Gender female = Gender.valueOf("Female");
        Age juliasAge = new Age(18);
        Address address = new Address("Veda haven","Vermont","Macedonia");
        Person personDetails = new Person(julias,female,juliasAge,address);
        Assert.assertEquals("Ms Julius Barrows,Macedonia", personDetails.getFirstNameFirstCountryWise());
    }

    @Test
    public void test_secondFirst_represent_guest_name_for_male() throws Exception {
        Name gavin = new Name("Gavin", "Hyatt");
        Gender male = Gender.valueOf("Male");
        Age gavinAge = new Age(36);
        Address address = new Address("Crooks ton","Illinois","Romania");
        Person personDetails = new Person(gavin,male,gavinAge,address);
        Assert.assertEquals("Mr Hyatt,Gavin,Romania", personDetails.getSecondNameFirstCountryWise());
    }
}