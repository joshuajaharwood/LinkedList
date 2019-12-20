/**
 * Implementation of a Linked List
 *
 * @author Joshua Harwood
 * @version 0.1
 */
public class LinkedList {
    private Node head, tail;

    /**
     * Constructor. Initialises our linked list.
     *
     * @param data An object to store in our initial node.
     */
    public LinkedList(Object data) {
        this.head = new Node(data);
        this.tail = null;
    }

    /**
     * Adds a node to the end of the linked list.
     *
     * @param data Data to be stored.
     */
    public void append(Object data) {
        Node n = new Node(data);

        if (tail == null) {
            head.setNext(n);
        } else {
            tail.setNext(n);
        }
    }

    public Object peek() {
        return tail.getData();
    }
}
