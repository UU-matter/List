/**
 * Created by student on 08.04.2015.
 */
public class Node {
    Object data;
    Node next;

    public Node(Object data_Value) {
        data = data_Value;
        next = null;
    }

    public Node(Object data_Value, Node nextValue) {
        next = nextValue;
        data = data_Value;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data_Value) {
        data = data_Value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextValue) {
        next = nextValue;
    }

    @Override
    public String toString() {
        String output = "";
        output = "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
        return output;
    }
}

