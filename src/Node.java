/**
 * Implementation of a Linked List node.
 *
 * @author Joshua Harwood
 * @version 1.0
 */
public class Node {
    private Object data;
    private Node next;

    /**
     * Constructor for a node.
     *
     * @param data Data to store in the node.
     */
    public Node(Object data) {
        this.data = data;
        this.next = null;
    }

    /**
     * Returns data stored in a node.
     *
     * @return data An Object instance.
     */
    public Object getData() {
        return data;
    }

    /**
     * Set the data for a node.
     * @param data New data to store in the node.
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * Returns a reference to the next node in the list.
     * @return Node object instance, or null if none.
     */
    public Node getNext() {
        return next;
    }

    /**
     * Set the next node after this instance.
     * @param next Node object instance.
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
