package collectionn.arrayList;

import java.util.ArrayList;
import java.util.List;

public class DemoSearchContains {
    public static void main(String[] args) {
       List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(30);
        System.out.println( "10 is present in elements: "+arrayList.contains(10));
        System.out.println("Index of the 10 is : "+arrayList.indexOf(20));

        arrayList.clear();
        System.out.println(arrayList);

    }
}
