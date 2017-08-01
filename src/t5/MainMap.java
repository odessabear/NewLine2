package t5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by X501A on 20.07.2017.
 */
public class MainMap {
    public static void main(String[] args) {
        HashMap<String,Integer> frozer = new HashMap<>();
        frozer.put("Apple",3);
        frozer.put("Cherry",5);
        frozer.put("Banana",2);

        if(frozer.containsKey("Banana")){
            int bananasinffozer = frozer.get("Banana");
            frozer.put("Banana",bananasinffozer + 3);
        }
        System.out.println(frozer);
        Set<String> fruits = frozer.keySet();
        System.out.println(fruits);

        Collection<Integer> massa = frozer.values();
        int obschiyVes = 0;
        for(Integer ves : massa){
            obschiyVes = obschiyVes + ves;
        }
        System.out.println(massa);
        System.out.println(obschiyVes);


        Set<Map.Entry<String,Integer>> tovari = frozer.entrySet();
        for(Map.Entry<String,Integer> tovar:tovari){
            System.out.println(tovar.getKey());
            System.out.println(tovar.getValue());
        }


    }
}
