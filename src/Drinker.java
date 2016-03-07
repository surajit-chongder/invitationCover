import java.util.ArrayList;
import java.util.List;

public class Drinker {
    private final int age;

    public Drinker(int age) {
        this.age = age;
    }

    public List filterLegalDrinker(List guest) {
        List<List> legalDrinkerList = new ArrayList<>();
            for (Object aGuestList : guest) {
                List each = (List) aGuestList;
                int age = Integer.parseInt((String) each.get(3));
                if (isLegalDrinker(age))
                    legalDrinkerList.add(each);

            }
        return legalDrinkerList;
    }

    public List filterIllegalDrinker(List guest) {
        List<List> unlegalDrinkerList = new ArrayList<>();
        for (Object aGuestList : guest) {
            List each = (List) aGuestList;
            int age = Integer.parseInt((String) each.get(3));
            if (!isLegalDrinker(age))
                unlegalDrinkerList.add(each);
        }
        return unlegalDrinkerList;
    }

    private boolean isLegalDrinker(int age) {
        return age >= this.age;
    }
}
