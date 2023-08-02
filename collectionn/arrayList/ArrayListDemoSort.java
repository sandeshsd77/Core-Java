package collectionn.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemoSort {
    public static void main(String[] args) {

    List list = new ArrayList<>();
    list.add(15);
    list.add(25);
    list.add(35);
    list.add(175);
    list.add(12);
    list.add(null);
    list.add(null);
    list.add("sandesh");
    list.add(3,10);

    list.forEach(System.out::println);


}
}
