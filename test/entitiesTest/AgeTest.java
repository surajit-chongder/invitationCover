package entitiesTest;

import entities.Age;
import org.junit.Test;

import static org.junit.Assert.*;

public class AgeTest {
    @Test
    public void test_isOlder_give_true_when_less_age_give() throws Exception {
        Age age = new Age(18);
        assertTrue(age.isOlder(17));
    }
    @Test
    public void test_isOlder_give_false_when_above_age_give() throws Exception {
        Age age = new Age(18);
        assertFalse(age.isOlder(19));
    }
}
