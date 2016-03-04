import org.junit.Assert;
import org.junit.Test;


public class PersonTest {
    @Test
    public void test_genderRepresentation_represent_Mr_for_male() throws Exception {
        Person person = new Person("Gavin", "Hyatt", "Male");
        Assert.assertEquals("Mr", person.genderRepresentation().toString());
    }

    @Test
    public void test_genderRepresentation_represent_Ms_for_female() throws Exception {
        Person person = new Person("Julius", "Barrows", "Female");
        Assert.assertEquals("Ms", person.genderRepresentation().toString());
    }

    @Test
    public void test_toString_represent_guest_name_for_female() throws Exception {
        Person person = new Person("Julius", "Barrows", "Female");
        Assert.assertEquals("Ms Julius Barrows", person.toString());
    }

    @Test
    public void test_toString_represent_guest_name_for_male() throws Exception {
        Person person = new Person("Gavin", "Hyatt", "Male");
        Assert.assertEquals("Mr Gavin Hyatt", person.toString());
    }

    @Test
    public void test_toString_with_delimiter_represent_guest_name_for_female() throws Exception {
        Person person = new Person("Julius", "Barrows", "Female");
        Assert.assertEquals("Ms Barrows,Julius", person.toString(","));
    }

    @Test
    public void test_toString_with_delemiter_represent_guest_name_for_male() throws Exception {
        Person person = new Person("Gavin", "Hyatt", "Male");
        Assert.assertEquals("Mr Hyatt,Gavin", person.toString(","));
    }
}
