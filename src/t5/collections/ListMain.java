package t5.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 * Created by X501A on 15.07.2017.
 */
public class ListMain {
    public static void main(String[] args) {
        List<Double> poryadok = new LinkedList<>();
        poryadok.add((double) 16);
        poryadok.add((double) 24);
        poryadok.add((double) 45);
        poryadok.add((double) 5);

       String[] answer = new String[3];
        answer[0] = "mama ";
        answer[1] ="mila ";
        answer[2] = "ramu";

        ListUtilsImpl string = new ListUtilsImpl();
        List<String> stringList = string.asList(answer);
        System.out.println(stringList);

        ListUtilsImpl data = new ListUtilsImpl();
        List<Double> sortData = data.sortedList(poryadok);
        System.out.println(sortData);
    }
    }

