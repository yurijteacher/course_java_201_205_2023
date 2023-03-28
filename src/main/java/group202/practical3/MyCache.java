package group202.practical3;

public interface MyCache<K,V> {
    V putCache(K key, V value);
    V getCache(K key);

}
