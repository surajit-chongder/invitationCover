import org.junit.Assert;
import org.junit.Test;

public class PersonAddressTest {
    @Test
    public void test_toString_give_only_country_name() throws Exception {
        PersonAddress personAddress =new PersonAddress("West Shanna","Vermont","Bangladesh");
        Assert.assertEquals("Bangladesh",personAddress.toString());
    }
}
