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
        String crunchifyString1 = "Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia";
        ArrayList<String> crunchifyResult1 = new ArrayList<>();
        String[] splitData1 = crunchifyString1.split(",");
        Collections.addAll(crunchifyResult1, splitData1);
        list.add(crunchifyResult1);

        String crunchifyString2 = "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh";
        ArrayList<String> crunchifyResult2 = new ArrayList<>();
        String[] splitData2 = crunchifyString2.split(",");
        Collections.addAll(crunchifyResult2, splitData2);
        list.add(crunchifyResult2);

        CountryWiseList countryWiseList = new CountryWiseList(list);
        HashMap countryHast = countryWiseList.mappingCountryGuest();
        HashMap expected = new HashMap<>();
        List<ArrayList> result1 = new ArrayList<>();
        List<ArrayList> result2 = new ArrayList<>();
        result1.add(crunchifyResult1);
        result2.add(crunchifyResult2);
        expected.put("Macedonia",result1);
        expected.put("Bangladesh",result2);

        assertEquals(countryHast,expected);
    }
}