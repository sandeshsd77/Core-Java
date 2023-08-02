package collectionn.arrayList;

import java.util.List;
import java.util.Vector;

public class DemoVector {
    public static void main(String[] args) {
        List list = new Vector();
        list.add(10);
        list.add(156);
        list.add(22);
        list.add(55);
        list.add("abc");
        list.add(true);
        list.add(null);
        list.add(null);
//        System.out.println(list);
        list.remove("10");
        System.out.println(list);
        System.out.println("size is "+list.size());

    }
}
