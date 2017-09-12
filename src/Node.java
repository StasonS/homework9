/**
 * Created by user on 10.09.17.
 */
public class Node<T> {

    T item;
    Node<T> next;
    Node<T> prev;

    public Node(Node<T> prev, T item, Node<T> next) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }
}
