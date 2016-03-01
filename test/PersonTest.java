import org.junit.Assert;
import org.junit.Test;


public class PersonTest {
    @Test
    public void test_toString_represent_person_name_for_female() throws Exception {
        Person person = new Person("Julius","Barrows","Female");
        Assert.assertEquals("Ms Julius Barrows",person.toString());
    }
    @Test
    public void test_toString_represent_person_name_for_male() throws Exception {
        Person person = new Person("Gavin","Hyatt","Male");
        Assert.assertEquals("Mr Gavin Hyatt",person.toString());
    }
}
