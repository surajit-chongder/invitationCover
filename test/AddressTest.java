import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddressTest {
    private Address address;

    @Before
    public void setUp() throws Exception {
        address = new Address("Veda haven", "Vermont", "Macedonia");
    }

    @Test
    public void test_isSameCountry_give_True_if_belongs_to_same_country() throws Exception {
        Assert.assertTrue(address.isSameCountry("Macedonia"));
    }

    @Test
    public void test_isSameCountry_give_False_if_not_belongs_to_same_country() throws Exception {
        Assert.assertFalse(address.isSameCountry("Bangladesh"));
    }
}
