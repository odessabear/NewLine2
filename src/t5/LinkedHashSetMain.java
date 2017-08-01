package t5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by X501A on 15.07.2017.
 */
public class LinkedHashSetMain {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        hashSet.add(7);
        hashSet.add(14);
        hashSet.add(21);
        hashSet.add(7);
        hashSet.add(7);
        hashSet.add(21);
        for (Iterator<Integer> iter = hashSet.iterator(); iter.hasNext();){
            System.out.println(iter.next().hashCode());

        }

    }
}
