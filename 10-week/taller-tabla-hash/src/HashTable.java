public class HashTable<K, V> {
    private Entry<K, V>[] buckets;
    private int capacity;
    private int size;

    @SuppressWarnings("unchecked")
    public HashTable(int capacity) {
        this.capacity = capacity;
        buckets = new Entry[capacity];
        size = 0;
    }

    private int indexFor(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public V put(K key, V value) {
        int idx = indexFor(key);
        Entry<K, V> head = buckets[idx];
        for (Entry<K, V> cur = head; cur != null; cur = cur.next) {
            if (cur.key.equals(key)) {
                V old = cur.value;
                cur.value = value;
                return old;
            }
        }
        buckets[idx] = new Entry<>(key, value, head);
        size++;
        return null;
    }

    public V get(K key) {
        int idx = indexFor(key);
        for (Entry<K, V> cur = buckets[idx]; cur != null; cur = cur.next) {
            if (cur.key.equals(key)) {
                return cur.value;
            }
        }
        return null;
    }

    public V remove(K key) {
        int idx = indexFor(key);
        Entry<K, V> prev = null, cur = buckets[idx];
        while (cur != null) {
            if (cur.key.equals(key)) {
                if (prev == null) buckets[idx] = cur.next;
                else prev.next = cur.next;
                size--;
                return cur.value;
            }
            prev = cur;
            cur = cur.next;
        }
        return null;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
