package collectionn.cursers_readingData;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// ListIterator is an interface it has 8 method ->
// it is use to only iterate only (Arraylist, LinkedList, Vector, Stack)
// hasNext()-> return true false till the time it has elements,
// next() -> return the elements and move the curser to the next element
// remove() -> to remove the elements from collection
// set() -> to set new value the elements from collection
// add() -> to add the elements from collection
// nextIndex() ->  next elements from collection
// previousIndex() -> previous elements index from collection
// hasPrevious() -> return true false till the time it has elements it is bidirectional curser
// while iterating we can add,remove,modify elements
// ListIterartor instance we can get it with method : listIterator();
public class ListIterator1 {
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
            if (integer == 26) {
                listIterator.remove();
            }
        }
        System.out.println(arrayList);
    }

}
//}