package t5.collections.multiMap;

import org.jetbrains.annotations.NotNull;

import java.util.*;

/**
 * Created by X501A on 22.07.2017.
 */
public class MultiMapImpl<K, V> extends HashMap<K, V> implements MultiMap<K, V> {
    private HashMap<K, List<V>> multiMap = new HashMap<K, List<V>>();


    @Override
    public V put(K key, V value) {
        if (multiMap.containsKey(key)) {
            List<V> values = multiMap.get(key);
            values.add(value);
            multiMap.put(key, values);
        } else {
            List<V> values = new ArrayList<V>();
            values.add(value);
            multiMap.put(key, values);
        }
        return value;
    }

    @Override
    public Set<K> keySet() {
        return multiMap.keySet();
    }

    @Override
    public int countValues(K key) {
        if (multiMap.containsKey(key)) {
            return multiMap.get(key).size();
        }
        return 0;
    }

    @Override
    public Iterator<V> valuesIterator(K key) {
        return multiMap.get(key).iterator();
    }


    @Override
    public String toString() {
        String string = "";
        for (K key : multiMap.keySet()) {
            string = string + key + " = [";

            StringJoiner j = new StringJoiner(",");
            for (V value : multiMap.get(key)) {
                j.add(value.toString());
            }

            string = string + j.toString();
            string = string + "]";
        }
        return string;
    }

    public V get(Object key) {
        if (multiMap.containsKey(key)) {
            int lastIndex = multiMap.get(key).size() - 1;
            return multiMap.get(key).get(lastIndex);
        } else {
            return null;
        }
    }


    public V remove(Object key) {
        V delete = this.get(key);
        List<V> values = multiMap.get(key);
        if (values != null) {
            values.clear();
            multiMap.put((K) key, values);
        }
        return delete;
    }

    @Override
    public int size() {
        return multiMap.keySet().size();
    }

    @Override
    public Collection<V> values() {
        ArrayList<V> values = new ArrayList<V>();
        for (K key : multiMap.keySet()) {
            for (V value : multiMap.get(key)) {
                values.add(value);
            }
        }
        return values;
    }

    @Override
    public boolean isEmpty() {
        return multiMap.keySet().isEmpty();
    }

    @Override
    public boolean replace(K key, V oldValue, V newValue) {
        if (multiMap.containsKey(key)) {
            List<V> values = multiMap.get(key);
            for (int i = 0; i < values.size(); i++) {
                if (values.get(i).equals(oldValue)) {
                    values.add(i, newValue);
                    values.remove(oldValue);
                    multiMap.put(key, values);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public V replace(K key, V value) {
        if (multiMap.containsKey(key)) {
            List<V> values = multiMap.get(key);
            values.clear();
            values.add(value);
            multiMap.put(key, values);
        }
        return value;
    }

}
