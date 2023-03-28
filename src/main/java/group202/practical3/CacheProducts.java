package group202.practical3;

import java.util.HashMap;
import java.util.Map;

public class CacheProducts implements MyCache{

    Map<Long, Product> map = new HashMap<>();

    @Override
    public Object putCache(Object key, Object value) {
        return map.put((Long) key, (Product) value);
    }

    @Override
    public Object getCache(Object key) {
        return map.get((Long) key);
    }
}
