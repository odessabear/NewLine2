package t5.collections;

import java.util.*;

/**
 * Created by X501A on 22.07.2017.
 */
public class SetUtilsImpl implements SetUtils{

    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {
        SortedSet<String> sortedSet = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return - o1.compareTo(o2);
            }
        });
        for (Integer i : collection1){
            sortedSet.add(i.toString());
        }
        sortedSet.addAll(set2);
        return sortedSet;
    }

    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        LinkedHashSet<Integer> customOrderSet = new LinkedHashSet<>();
        customOrderSet.add(val1);
        customOrderSet.add(val2);
        customOrderSet.add(val3);
        customOrderSet.add(val4);
        customOrderSet.add(val5);
        return customOrderSet;
    }
}
