import java.util.ArrayList;
import java.util.List;

public class FilterAge {
    private final int age;

    public FilterAge(int age) {
        this.age = age;
    }

    public List filterAboveRequireAge(List guest) {
        List<List> legalDrinkerList = new ArrayList<>();
            for (Object aGuestList : guest) {
                List each = (List) aGuestList;
                int age = Integer.parseInt((String) each.get(3));
                if (isLegalDrinker(age))
                    legalDrinkerList.add(each);

            }
        return legalDrinkerList;
    }

    public List filterBelowRequireAge(List guest) {
        List<List> illegalDrinkerList = new ArrayList<>();
        for (Object aGuestList : guest) {
            List each = (List) aGuestList;
            int age = Integer.parseInt((String) each.get(3));
            if (!isLegalDrinker(age))
                illegalDrinkerList.add(each);
        }
        return illegalDrinkerList;
    }

    private boolean isLegalDrinker(int age) {
        return age >= this.age;
    }
}
