package collectionn.cursers_readingData;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorAddElement2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(70);
        arrayList.add(8);
        arrayList.add(25);
        arrayList.add(78);
        arrayList.add(26);
        arrayList.add(48);
        arrayList.add(68);

        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            Integer integer = (Integer) next; // converted object into Integer
            if (integer == 8) {
                listIterator.add(32);
            }
        }
        System.out.println(arrayList);
    }

}
//}