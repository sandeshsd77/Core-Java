package collectionn.arrayList;

import java.util.ArrayList;

public class DemoRetain {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add("sandesh");
        arrayList.add(null);
        arrayList.add(2, null); // we add the null at index 2
        arrayList.add("sandesh");
        arrayList.add(10);

        ArrayList keepIt = new ArrayList();
        keepIt.add(20);
        keepIt.add(30);
        arrayList.retainAll(keepIt);
        System.out.println(arrayList);
    }
}
