import java.util.stream.IntStream;

/**
 * Driver class for Linked List implementation.
 *
 * @author Joshua Harwood
 * @version 0.2
 */
public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList(0);

        // Construct some data to fill our linked list
        IntStream.range(1, 20).forEach(l::append);

        l.traverseList();
    }
}
