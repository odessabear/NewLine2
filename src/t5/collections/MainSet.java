package t5.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

/**
 * Created by X501A on 22.07.2017.
 */
public class MainSet {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(){
            @Override
            public String toString() {
                String result = "";
                Object[] elementData = this.toArray();
                for (Object elem : elementData){
                    result = result + elem + " ";
                }
                return result;
            }
        };
        HashSet<String> strings = new HashSet<String>(){

            @Override
            public String toString() {
                String result = "";
                Object[] elementData = this.toArray();
                for (Object elem : elementData){
                    result = result + elem + " ";
                }
                return result;
            }
        };

        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        System.out.println(numbers.toString());

        strings.add("text1");
        strings.add("text4");
        strings.add("text3");
        strings.add("text2");
        System.out.println(strings.toString());

        SetUtilsImpl sortUtils = new SetUtilsImpl();
        SortedSet<String> result = sortUtils.orderedSet(numbers,strings);

        System.out.println(result);

        Set<Integer> integers = sortUtils.customOrderSet(2,45,56,67,89);
        System.out.println(integers);




    }
}
