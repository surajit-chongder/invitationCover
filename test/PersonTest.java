import org.junit.Assert;
import org.junit.Test;


public class PersonTest {
    @Test
    public void test_simpleLabelRepresent_represent_guest_name_for_female() throws Exception {
        Person person = new Person("Julius", "Barrows", "Female");
        Assert.assertEquals("Ms Julius Barrows",person.toString());
    }

    @Test
    public void test_simpleLabelRepresent_represent_guest_name_for_male() throws Exception {
        Person person = new Person("Gavin", "Hyatt", "Male");
        Assert.assertEquals("Mr Gavin Hyatt",person.toString());
    }

    @Test
    public void test_toString_represent_guest_name_for_female() throws Exception {
        Person person = new Person("Julius", "Barrows", "Female");
        Assert.assertEquals("Ms Barrows,Julius",person.toString(","));
    }

    @Test
    public void test_toString_represent_guest_name_for_male() throws Exception {
        Person person = new Person("Gavin", "Hyatt", "Male");
        Assert.assertEquals("Mr Hyatt,Gavin",person.toString(","));
    }
}
