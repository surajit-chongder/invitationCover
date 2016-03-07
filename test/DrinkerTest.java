import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class DrinkerTest {
    @Test
    public void test_filterIllegalDrinker_filter_guest_whom_age_less_than_20() throws Exception {
        Drinker drinker = new Drinker(20);

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

        List<List> expectedResult = new ArrayList<>();
        expectedResult.add(personList1);
        assertEquals(expectedResult,drinker.filterIllegalDrinker(list));
    }
    @Test
    public void test_filterLegalDrinker_filter_guest_whom_age_less_than_20() throws Exception {
        Drinker drinker = new Drinker(20);

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

        List<List> expectedResult = new ArrayList<>();
        expectedResult.add(personList2);
        assertEquals(expectedResult,drinker.filterLegalDrinker(list));
    }
}