package t5.collections.multiMap;

/**
 * Created by X501A on 22.07.2017.
 */
public class MainMultiMap {
    public static void main(String[] args) {
        MultiMapImpl<String,Integer> multiMap = new MultiMapImpl<>();

        multiMap.put("Banana",3);
        multiMap.put("Cherry",5);
        multiMap.put("Apple",4);
        multiMap.put("Banana",8);
        multiMap.put("Banana",6);
        multiMap.put("Banana",9);
        multiMap.put("Cherry",3);

        System.out.println(multiMap.toString());
        System.out.println(multiMap.countValues("Apple"));
        System.out.println(multiMap.get("Banana"));
//        multiMap.remove("Banana");
        System.out.println(multiMap);

        System.out.println(multiMap.size());

        System.out.println(multiMap.values());

        System.out.println(multiMap.isEmpty());

        System.out.println(multiMap.replace("Banana",3,6));
        System.out.println(multiMap);

        multiMap.replace("Banana",15);

        System.out.println(multiMap);



    }
}
