package groupe205.practical3;

import java.util.HashMap;
import java.util.Map;

public class CategoryCache implements MyCache{
    private Map<Long, Category> cache = new HashMap<>();

    @Override
    public void putCache(Object key, Object value) {
        cache.put((Long) key, (Category) value);
    }

    @Override
    public Object getCache(Object key) {
        return cache.get(key);
    }

    public void print(){
        for (Map.Entry<Long, Category> el : cache.entrySet()) {
            System.out.println(el);
        }
    }
}
