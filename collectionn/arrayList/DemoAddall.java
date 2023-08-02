package collectionn.arrayList;

import java.util.ArrayList;

public class DemoAddall {
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
        System.out.println("Before add the elements");
        System.out.println(arrayList);

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(15);
        arrayList1.add("abc");
        System.out.println("...................................................");
        System.out.println("Elements are added : "+ arrayList1.addAll(arrayList));
        System.out.println("After add the elements ");
        System.out.println(arrayList1);
    }
}
