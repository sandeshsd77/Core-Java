package collectionn.arrayList;

import java.util.ArrayList;

public class DemoRemoveMultiple {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(30);
        arrayList.add("sandesh");
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add("sandesh");
        arrayList.add("sandesh");
        arrayList.add("sandesh");
        arrayList.add(10);
        System.out.println("Before remove elements ");
        System.out.println(arrayList);

        System.out.println("After remove the Multiple elements");
        ArrayList deleteList = new ArrayList();
        deleteList.add(20);
        deleteList.add(null);
        deleteList.add("sandesh");
        arrayList.removeAll(deleteList);
        System.out.println(arrayList);
    }
}
