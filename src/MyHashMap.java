import java.util.HashMap;

/**
 * Created by user on 10.09.17.
 */
public class MyHashMap<K, V> {

    private int size = 0;
    Node<K, V> firstElement;
    Node<K, V> lastElement;

    void put(K key, V value){
        if (this.containsKey(key)){
            this.getNode(key).value = value;
        }
        else{
            if (firstElement == null){
                firstElement = new Node<>(key, value, null);
                lastElement = firstElement;
                size++;
            }
            else {
                Node<K, V> node = new Node<>(key, value, null);
                lastElement.next = node;
                lastElement = node;
                size++;
            }
        }
    }

    void remove(K key){

        if (firstElement != null){
            if (this.containsKey(key)){
                Node<K, V> node = firstElement;
                for (int i = 0; i < size(); i ++){
                    if (node.next == this.getNode(key)){
                        node.next = node.next.next;
                        size--;
                    }
                    else {
                        node = node.next;
                    }
                }
            }
        }
    }

    void clear(){
        firstElement = null;
        lastElement = null;
        size = 0;
    }

    int size(){
        return size;
    }

    V get(K key){

        if (firstElement != null) {
            Node<K, V> obj = firstElement;
            for (int i = 0; i < size(); i++) {
                if (obj.key == key)
                    return obj.value;
                obj = obj.next;
            }
        }
        return null;
    }


    /**
     *Ниже вспомогательная часть.
     **/

    private static class Node<K, V>{
        final K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private boolean containsKey(K key){

        if (firstElement != null){
            Node<K, V> obj = firstElement;
            for (int i = 0; i < size(); i++){
                if (obj.key == key)
                    return true;
                obj = obj.next;
            }
        }
        return false;
    }

    private Node<K, V> getNode(K key){

        if (firstElement != null){
            Node<K, V> node = firstElement;
            for (int i = 0; i < size(); i++){
                if (node.key == key){
                    return node;
                }
                else {
                    node = node.next;
                }
            }
        }
        return null;
    }
}
