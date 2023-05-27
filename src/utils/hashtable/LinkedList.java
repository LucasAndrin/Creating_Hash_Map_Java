package utils.hashtable;

public class LinkedList<K, V> {

    private Node<K, V> head;

    public LinkedList() {

    }

    public LinkedList(K key, V value) {
        setHead(new Node<>(key, value));
    }

    public void append(K key, V value) {
        Node<K, V> newNode = new Node<>(key, value);
        Node<K, V> aux = getHead();
        while (aux.getNext() != null) {
            aux = aux.getNext();
        }
        aux.setNext(newNode);
    }

    public Node<K, V> getHead() {
        return head;
    }

    public void setHead(Node<K, V> head) {
        this.head = head;
    }

}
