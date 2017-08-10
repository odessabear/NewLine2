package t5.collections.multiMap;

import t5.collections.multiMap.MapKey;
import t5.collections.multiMap.MapUtils;
import t5.collections.multiMap.MultiMap;
import t5.collections.multiMap.MultiMapImpl;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by X501A on 06.08.2017.
 */
public class MapUtilsImpl implements MapUtils {

    @Override
    public MultiMap<MapKey, Integer> merge(Map<MapKey, Integer>... maps) throws IllegalArgumentException {
        MultiMapImpl<MapKey,Integer> unity = new MultiMapImpl<>();
        for(Map<MapKey, Integer> map: maps){
            Set<MapKey> keys = map.keySet();
            for (MapKey key:keys){
                unity.put(key,map.get(key));
            }

        }
       // unity.values();

        return unity;
    }
}
