package t5.collections.multiMap;

/**
 * Created by X501A on 22.07.2017.
 */
public class MainMultiMap {
    public static void main(String[] args) {
        MultiMapImpl<MapKeyImpl,Integer> multiMap = new MultiMapImpl<>();

        multiMap.put(new MapKeyImpl("Banana"),3);
        multiMap.put(new MapKeyImpl("Cherry"),5);
        multiMap.put(new MapKeyImpl("Apple"),4);
        multiMap.put(new MapKeyImpl("Banana"),8);
        multiMap.put(new MapKeyImpl("Banana"),6);
        multiMap.put(new MapKeyImpl("Banana"),9);
        multiMap.put(new MapKeyImpl("Cherry"),3);

        System.out.println(multiMap.toString());
        System.out.println(multiMap.countValues(new MapKeyImpl("Apple")));
        System.out.println(multiMap.get(new MapKeyImpl("Banana")));
//        multiMap.remove("Banana");
        System.out.println(multiMap);

        System.out.println(multiMap.size());

        System.out.println(multiMap.values());

        System.out.println(multiMap.isEmpty());

        System.out.println(multiMap.replace(new MapKeyImpl("Banana"),3,6));
        System.out.println(multiMap);

        multiMap.replace(new MapKeyImpl("Banana"),15);

        System.out.println(multiMap);



    }
}
