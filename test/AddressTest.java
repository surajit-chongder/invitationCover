import org.junit.Assert;
import org.junit.Test;

public class AddressTest {
    @Test
    public void test_toString_give_only_country_name() throws Exception {
        Address address =new Address("West Shanna","Vermont","Bangladesh");
        Assert.assertEquals("Bangladesh", address.toString());
    }
}
