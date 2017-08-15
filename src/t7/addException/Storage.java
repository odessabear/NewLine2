package t7.addException;

import java.util.ArrayList;

/**
 * Created by X501A on 15.08.2017.
 */
public class Storage {
    private static ArrayList<Integer> array = new ArrayList<>();

    public synchronized static void add(Integer i){
            array.add(i);

    }

    public synchronized void det(){

    }
}
