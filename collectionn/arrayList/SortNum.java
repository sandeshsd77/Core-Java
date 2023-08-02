package collectionn.arrayList;

import java.util.*;

public class SortNum {
    public static void main(String[] args) {
//        This are the two way to create Integer array
        List <Integer> list = new ArrayList<>(Arrays.asList(15,66,65,30,14,45,78));
//        List <Integer> list = new ArrayList<>();
//        list.add(15);
//        list.add(66);
//        list.add(65);
//        list.add(23);
//        list.add(14);
//        list.add(741);
        System.out.println(list);

        Collections.sort(list);


        System.out.println(list);

    }
}
