import java.util.HashMap;

/**
 * Created by user on 10.09.17.
 */
public class MyHashMap<K, V> {

    private int size = 0;
    private Node<V> first;
    private Node<V> last;





    private static class Node<T>{
        T value;
        Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }
}
