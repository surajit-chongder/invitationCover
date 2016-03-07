import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class CountryWiseListTest {
    @Test
    public void test_mappingCountryGuest_give_guest_records_country_wise() throws Exception {
        List<ArrayList<String>> list = new ArrayList<>();
        String recordString1 = "Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia";
        ArrayList<String> personList1 = new ArrayList<>();
        String[] splitData1 = recordString1.split(",");
        Collections.addAll(personList1, splitData1);
        list.add(personList1);

        String recordString2 = "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh";
        ArrayList<String> personList2 = new ArrayList<>();
        String[] splitData2 = recordString2.split(",");
        Collections.addAll(personList2, splitData2);
        list.add(personList2);

        CountryWiseList countryWiseList = new CountryWiseList(list);
        HashMap countryHast = countryWiseList.mappingCountryGuest();
        HashMap expected = new HashMap<>();
        List<ArrayList> result1 = new ArrayList<>();
        List<ArrayList> result2 = new ArrayList<>();
        result1.add(personList1);
        result2.add(personList2);
        expected.put("Macedonia", result1);
        expected.put("Bangladesh", result2);

        assertEquals(countryHast, expected);
    }
}