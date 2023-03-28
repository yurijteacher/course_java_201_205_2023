package groupe205.practical3;

public interface MyCache<K, V> {

    void putCache(K key, V value);
    V getCache(K key);
}
