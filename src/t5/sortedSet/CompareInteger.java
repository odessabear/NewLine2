package t5.sortedSet;

import java.util.Comparator;

/**
 * Created by X501A on 15.07.2017.
 */
public class CompareInteger implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return - o1.compareTo(o2);
    }
}
