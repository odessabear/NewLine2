package t5.collections.multiMap;

/**
 * Created by X501A on 09.08.2017.
 */
public class MainMapUtils  {
    public static void main (String[] args){
        MultiMap<MapKey,Integer> mapResult = new MultiMapImpl<>();
        mapResult.put(new MapKeyImpl("Banana"),3);
        mapResult.put(new MapKeyImpl("Banana"),5);
        mapResult.put(new MapKeyImpl("Cherry"),6);
        mapResult.put(new MapKeyImpl("Apple"),8);
        mapResult.put(new MapKeyImpl("Apple"),7);
        mapResult.put(new MapKeyImpl("Pich"),4);

        MultiMap<MapKey,Integer> mapResult2 = new MultiMapImpl<>();
        mapResult2.put(new MapKeyImpl("Banana"),3);
        mapResult2.put(new MapKeyImpl("Banana"),4);
        mapResult2.put(new MapKeyImpl("Cherry"),9);
        mapResult2.put(new MapKeyImpl("Apple"),88);
        mapResult2.put(new MapKeyImpl("Apple"),0);
        mapResult2.put(new MapKeyImpl("Pich"),3);


        MapUtilsImpl mapUtils = new MapUtilsImpl();
        MultiMap<MapKey, Integer> result = mapUtils.merge(mapResult, mapResult2);
        System.out.println(result);
    }
}
