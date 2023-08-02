package collectionn.arrayList;

import java.util.ArrayList;

public class DemoRemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("20");
        arrayList.add("30");
        arrayList.add("30");
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add("10");
        arrayList.add("abc");
        System.out.println("Before remove elements ");
        System.out.println(arrayList);

        System.out.println("....................................");

        System.out.println("After remove if");
        arrayList.removeIf((num) -> num =="abc");
        System.out.println(arrayList);

        // remove the String
    }
}
