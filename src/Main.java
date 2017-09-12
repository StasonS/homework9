/**
 * Created by user on 26.08.17.
 */
public class Main {

    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>(Integer.class);
//        for (int i = 0; i < 100; i++){
//            list.add(i);
//        }
//
//        for (int i = 0; i < 30; i++){
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();
//        System.out.println(list.size());
//        list.clear();
//        System.out.println(list.size());

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        for (int i = 0; i < 5; i++){
            linkedList.add(i);
        }
        System.out.println("Let's see second element: " + linkedList.get(2));
        linkedList.remove(2);
        System.out.println("Removing second element");
        System.out.println("Let's see second element again: " + linkedList.get(2));
        System.out.println("All elements are:");
        for (int i = 0; i < linkedList.size(); i++){
            System.out.println(linkedList.get(i));
        }
        linkedList.clear();
        System.out.println("List cleared. Size is: " + linkedList.size());
    }
}
