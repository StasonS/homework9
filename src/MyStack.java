/**
 * Created by user on 10.09.17.
 */
public class MyStack<T> extends MyQeue {

    private int size = 0;
    private Node<T> first;
    private Node<T> last;

    public void push(T value){
        if (first == null){
            first = new Node<T>(null, value, null);
            last = first;
        }
        else {
            Node<T> node = new Node<T>(last, value, null);
            last.next = node;
            last = node;
        }
        size++;
    }

    public void remove(int index){
        Node node = first;
        for (int i = 0; i < index; i++){
            node = node.next;
        }
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
        node = null;
        size--;
    }

    public void clear(){
        first = null;
        last = null;
        size = 0;
    }

    public int size(){return size;}

    public T peek(){
        return last.item;
    }

    public T pop(){
        T item = last.item;
        last.prev.next = null;
        size--;
        return item;
    }
}
