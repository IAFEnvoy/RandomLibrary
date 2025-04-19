package com.iafenvoy.random.library.misc;

import java.util.Iterator;
import java.util.Map;

public final class CollectionUtil {
    public static <K, V> Map.Entry<K, V> getLast(Map<K, V> map) {
        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        Map.Entry<K, V> last = null;
        while (iterator.hasNext()) last = iterator.next();
        return last;
    }
}
