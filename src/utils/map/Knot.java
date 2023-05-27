package utils.map;

public class Knot {

    private String key;

    private Object obj;

    private Knot next;

    public Knot(String key, Object obj) {
        setKey(key);
        setObj(obj);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Knot getNext() {
        return next;
    }

    public void setNext(Knot next) {
        this.next = next;
    }
}
