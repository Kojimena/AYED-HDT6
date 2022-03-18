package Maps;

public interface Imap<K,V> {


    /**
     * @pre k is non-null
     * @post returns true iff k is in the domain of the map
     */
    public abstract boolean containsKey(K k);

    /**
     * @pre v is non-null
     * @post returns true iff v is the target of at least one map entry;
     * that is, v is in the range of the map
     */
    public abstract boolean containsValue(V v);

    /**
     * @pre k is a key, possibly in the map
     * @post returns the value mapped to from k, or null
     */
    public abstract V get(K key);

    /**
     * @pre k and v are non-null
     * @post inserts a mapping from k to v in the map
     */
    public V put(K key, V value);
    

    /**
    * @param index index of the key
    * @return key
    */
    public abstract K getKey(int index);


    /**
     * @pre other is non-null
     * @post returns true iff maps this and other are entry-wise equal
     */
    public boolean equals(Object other);
    
    /**
     * @post returns a hash code associated with this structure
     */
    public int hashCode();
}

