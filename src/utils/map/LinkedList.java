package utils.map;

public class LinkedList {

    private Knot head;

    public LinkedList(String key, Object obj) {
        setHead(new Knot(key, obj));
    }

    public void append(String key, Object obj) {
        Knot newKnot = new Knot(key, obj);
        Knot aux = getHead();
        while (aux.getNext() != null) {
            aux = aux.getNext();
        }
        aux.setNext(newKnot);
    }

    public Knot getHead() {
        return head;
    }

    public void setHead(Knot head) {
        this.head = head;
    }

}
