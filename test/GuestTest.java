import org.junit.Assert;
import org.junit.Test;


public class GuestTest {
    @Test
    public void test_simpleLabelRepresent_represent_guest_name_for_female() throws Exception {
        Guest guest = new Guest("Julius", "Barrows", "Female");
        Assert.assertEquals("Ms Julius Barrows", guest.simpleLabelRepresent());
    }

    @Test
    public void test_simpleLabelRepresent_represent_guest_name_for_male() throws Exception {
        Guest guest = new Guest("Gavin", "Hyatt", "Male");
        Assert.assertEquals("Mr Gavin Hyatt", guest.simpleLabelRepresent());
    }

    @Test
    public void test_labelRepresentAccordingToSecondname_represent_guest_name_for_female() throws Exception {
        Guest guest = new Guest("Julius", "Barrows", "Female");
        Assert.assertEquals("Ms Barrows,Julius", guest.labelRepresentAccordingToSecondname());
    }

    @Test
    public void test_labelRepresentAccordingToSecondname_represent_guest_name_for_male() throws Exception {
        Guest guest = new Guest("Gavin", "Hyatt", "Male");
        Assert.assertEquals("Mr Hyatt,Gavin", guest.labelRepresentAccordingToSecondname());
    }
}
