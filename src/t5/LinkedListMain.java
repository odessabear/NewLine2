package t5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by X501A on 15.07.2017.
 */
public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> massiv = new LinkedList<>();
        massiv.add(8);
        massiv.add(24);
        massiv.add(0, 6);

        for (int i = 0;i < massiv.size();i++){
            System.out.println(massiv.get(i));
        }
        for (Iterator<Integer> it = massiv.iterator(); it.hasNext(); ){
            System.out.println(it.next());
        }

    }
}
