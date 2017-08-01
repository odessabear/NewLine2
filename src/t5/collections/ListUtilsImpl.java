package t5.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by X501A on 22.07.2017.
 */
public class ListUtilsImpl implements ListUtils {
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        List<String> s = new ArrayList<>();
        for (String i : strings ){
            s.add(i);
        }
        return s;
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        List<Double> sortedData = new LinkedList<>();
        for (Double i : data){
            sortedData.add(i);
        }
        sortedData.sort(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return -o1.compareTo(o2);
            }
        });
        return  sortedData;
    }
}
