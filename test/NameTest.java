import org.junit.Assert;
import org.junit.Test;


public class NameTest {
    @Test
    public void test_toString_represent_guest_name_for_female() throws Exception {
        Name name = new Name("Julius", "Barrows");
        Assert.assertEquals("Julius Barrows", name.toString());
    }

    @Test
    public void test_toString_represent_guest_name_for_male() throws Exception {
        Name name = new Name("Gavin", "Hyatt");
        Assert.assertEquals("Gavin Hyatt", name.toString());
    }

    @Test
    public void test_toString_with_delimiter_represent_guest_name_for_female() throws Exception {
        Name name = new Name("Julius", "Barrows");
        Assert.assertEquals("Barrows,Julius", name.toString(","));
    }

    @Test
    public void test_toString_with_delimiter_represent_guest_name_for_male() throws Exception {
        Name name = new Name("Gavin", "Hyatt");
        Assert.assertEquals("Hyatt,Gavin", name.toString(","));
    }
}
