package t5.collections;

import java.util.*;

/**
 * Created by X501A on 18.07.2017.
 */
public class CollectinUtilsHW implements CollectionUtils {


    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> col1 = new ArrayList<>();
        col1.addAll(a);
        col1.addAll(b);
        return col1;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> col2 = new ArrayList<>();
        for (Integer integer : a) {
            if (b.contains(integer)) {
                col2.add(integer);
            }
        }
        for (Integer integer : b) {
            if (a.contains(integer)) {
                col2.add(integer);
            }
        }
        return col2;
    }


    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> col3 = new HashSet<>();
        col3.addAll(a);
        col3.addAll(b);
        return col3;
    }


    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> col4 = new HashSet<>();
        for (Integer integer : a) {
            if (b.contains(integer)) {
                col4.add(integer);
            }
        }
        for (Integer integer : b) {
            if (a.contains(integer)) {
                col4.add(integer);
            }
        }
        return col4;
    }

    @Override
    public Set<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> col5 = new HashSet<>();
        for (Integer integer : a) {
            if (!b.contains(integer)) {
                col5.add(integer);
            }
        }
        for (Integer integer : b) {
            if (!a.contains(integer)) {
                col5.add(integer);
            }
        }
        return col5;
    }
}
