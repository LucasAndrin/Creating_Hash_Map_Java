package utils.hashtable;

public class Dictionary<K, V> {

    private static final int MAXIMUM_SIZE = 30;

    protected int length = 0;

    private LinkedList<K, V>[] linkedLists;

    public Dictionary() {
        linkedLists = new LinkedList[MAXIMUM_SIZE];
    }

    public static int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    public void put(K key, V value) {
        putVal(key, value, hash(key));
    }

    public V get(K key) {
        return getVal(key, hash(key));
    }

    public boolean remove(K key) {
        return removeVal(key, hash(key));
    }

    private void putVal(K key, V value, int hash) {
        int index = hash % MAXIMUM_SIZE;
        if (linkedLists[index] == null) {
            linkedLists[index] = new LinkedList<>(key, value);
            length++;
            return;
        }

        Node<K, V> aux = linkedLists[index].getHead();
        while (aux != null) {
            if (aux.getKey().equals(key)) {
                aux.setValue(value);
                return;
            }
            aux = aux.getNext();
        }

        linkedLists[index].append(key, value);
        length++;
    }

    private V getVal(K key, int hash) {
        int index = hash % MAXIMUM_SIZE;
        if (linkedLists[index] == null) {
            return null;
        }

        Node<K, V> aux = linkedLists[index].getHead();
        while (aux != null) {
            if (aux.getKey().equals(key)) {
                return aux.getValue();
            }
            aux = aux.getNext();
        }

        return null;
    }

    private boolean removeVal(K key, int hash) {
        int index = hash % MAXIMUM_SIZE;
        if (linkedLists[index] != null) {
            Node<K, V> prev = linkedLists[index].getHead();
            if (prev.getKey().equals(key)) {
                linkedLists[index] = null;
                return true;
            }

            Node<K, V> aux = prev.getNext();
            while (aux != null) {
                Node<K, V> next = aux.getNext();
                if (aux.getKey().equals(key)) {
                    prev.setNext(next);
                    return true;
                }
                prev = aux;
                aux = next;
            }
        }

        return false;
    }

}
