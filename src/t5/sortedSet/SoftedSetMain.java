package t5.sortedSet;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by X501A on 15.07.2017.
 */
public class SoftedSetMain {
    public static void main(String[] args) {
        TreeSet<Integer> sortedSet = new TreeSet<>(new CompareInteger());
        sortedSet.add(77787);
        sortedSet.add(544);
        sortedSet.add(7);
        sortedSet.add(7);
        sortedSet.add(14);
        sortedSet.add(21);
        sortedSet.add(7);
        sortedSet.add(7);
        sortedSet.add(21);
        for (Iterator<Integer> iter = sortedSet.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }
    }
}
