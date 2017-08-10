package t5.collections.multiMap;

/**
 * Created by X501A on 06.08.2017.
 */
public class MapKeyImpl  implements MapKey {
    private Object key;

    public MapKeyImpl(Object key){
        this.key = key;
    }

    @Override
    public String getValue() {
        return key.toString();
    }


    @Override
    public String toString() {
        return key.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MapKeyImpl mapKey = (MapKeyImpl) o;

        return key.equals(mapKey.key);

    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }
}
