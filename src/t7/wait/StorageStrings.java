package t7.wait;

import java.util.LinkedList;

/**
 * Created by X501A on 15.08.2017.
 */
public class StorageStrings {
    private static LinkedList<String> strings = new LinkedList<>();

    public void addString(String str) {
        strings.add(str);
    }

    public String getLastString() {
        if (strings.size() == 0){
            return null;
        }
       return strings.remove(strings.size() - 1);
    }

    public Object getMonitor(){
        return strings;
    }
}
