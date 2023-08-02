package collectionn.arrayList;

import java.util.ArrayList;

public class DemoRemove {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add("sandesh");
        arrayList.add(null);
        arrayList.add("sandesh");
        arrayList.add(10);
        System.out.println("Before remove elements ");
        System.out.println(arrayList);

        System.out.println("After remove the elements");
       arrayList.remove(null);
       arrayList.remove("sandesh");
        System.out.println(arrayList);
    }
}
