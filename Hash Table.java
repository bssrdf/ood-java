public class Cell<K, V>{
    private K key;
    private V value;
    public Cell(K k, V v){}
    public boolean equivalent(Cell<K, V> c){}
    public boolean equivalent(K k){}
    public K getKey(){}
    public V getValue(){}
}

public class Hash<K, V>{
    private final int MAX_SIZE = 10;
    LinkedList<Cell<K,V>>[] = items;
    public Hash(){}
    public int hashCodeOfKey(K key){}
    public void put(K key, V value){}
    public void get(K key){}
}