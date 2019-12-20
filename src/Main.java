/**
 * Driver class for Linked List implementation.
 *
 * @author Joshua Harwood
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {

        // Construct some data to fill our linked list
        int[] values = new int[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = i;
            System.out.println(i + ": " + values[i]);
        }

        LinkedList l = new LinkedList(values[0]);
        l.append(values[1]);
    }
}
