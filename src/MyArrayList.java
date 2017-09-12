import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by user on 20.08.17.
 */
public class MyArrayList<T> {

    private T[] array;
    private int counter = 0;

    @SuppressWarnings("unchecked")
    public MyArrayList(Class<T> t) {
        this.array = (T[]) Array.newInstance(t, 10);
    }

    public void add(T t){
        if (counter == (array.length - 2)){
            array[counter++] = t;
            T[] tmp = Arrays.copyOf(array, array.length * 2);
            array = tmp;
        }
        else {
            array[counter++] = t;
        }
    }

    public void remove(int index){
        array[index] = null;
    }

    @SuppressWarnings("unchecked")
    public void clear(){
        Class c = array.getClass();
        this.array = (T[]) Array.newInstance(c, 10);
        counter = 0;
    }

    public int size(){
        return counter;
    }

    public T get(int index){
        return array[index];
    }
}
