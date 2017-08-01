package t5.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by X501A on 20.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        HashSet<Integer> b = new HashSet<>();
        b.add(1);
        b.add(2);
        b.add(7);
        b.add(8);

        CollectinUtilsHW utilsHW = new CollectinUtilsHW();
        Collection<Integer>  result = utilsHW.union(a,b);
        System.out.println(result);

        Collection<Integer> result2 = utilsHW.intersection(a,b);
        System.out.println(result2);

        Set<Integer> result3 = utilsHW.unionWithoutDuplicate(a,b);
        System.out.println(result3);

        Set<Integer> result4 = utilsHW.intersectionWithoutDuplicate(a,b);
        System.out.println(result4);

        Set<Integer> result5 = utilsHW.difference(a,b);
        System.out.println(result5);
    }
}
