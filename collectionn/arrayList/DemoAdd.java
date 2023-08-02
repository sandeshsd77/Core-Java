package collectionn.arrayList;

import java.util.ArrayList;

public class DemoAdd {
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
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        //  output : [10, 20, null, 30, sandesh, null, sandesh, 10]
        // 8
    }
}
