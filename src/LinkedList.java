/**
 * Implementation of a Linked List
 *
 * @author Joshua Harwood
 * @version 0.2
 */
public class LinkedList {
    private Node head, tail;
    private int length;

    /**
     * Constructor. Initialises our linked list.
     *
     * @param data An object to store in our initial node.
     */
    public LinkedList(Object data) {
        this.head = new Node(data);
        this.tail = null;
        this.length = 1;

        //debug msg
        System.out.printf("DEBUG: Init   - Length: %d, Value: %s%n", length, head.getData());
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
        tail = n;

        length++;

        //debug msg
        System.out.printf("DEBUG: Append - Length: %d, Value: %s%n", length, tail.getData());
    }

    /**
     * Interates through the linked list, printing the value of each data object.
     */
    public void traverseList() {
        Node c = head;

        System.out.println("DEBUG: Traversal");
        while (c != null) {
            System.out.printf("Value: %s%n", c.getData());
            c = c.getNext();
        }
    }

    /**
     * Returns the data stored by the end node of our list without removing it.
     *
     * @return An Object instance.
     */
    public Object peekTail() {
        return tail.getData();
    }

    /**
     * Returns the data stored by the first node of our list without removing it.
     *
     * @return An Object instance.
     */
    public Object peekHead() {
        return head.getData();
    }

    /**
     * Returns the length of our linked list.
     *
     * @return Length as integer (starting at 1).
     */
    public int getLength() {
        return length;
    }
}