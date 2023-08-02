package collectionn.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DemoIf {
    public static void main(String[] args) {
       List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(15);
        arrayList.add(68);
        arrayList.add(5);
        arrayList.add(13);
        System.out.println("Before remove elements:");
        System.out.println(arrayList);

        Collections.sort(arrayList);

        System.out.println("after sorting: "+arrayList);
        System.out.println("....................................");

        arrayList.removeIf(num -> num %2!= 0);
        System.out.println("After remove if:");
        System.out.println(arrayList);

    }
}
