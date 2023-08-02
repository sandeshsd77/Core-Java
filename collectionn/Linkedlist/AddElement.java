package collectionn.Linkedlist;

import java.util.LinkedList;
import java.util.List;

public class AddElement {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(70);
        list.add(90);
        list.add(99);
        System.out.println(list);
        list.remove(Integer.valueOf(20));
        list.set(3,90);
        list.add(45);
        System.out.println(list.lastIndexOf(99));
        System.out.println(list);

    }

}
