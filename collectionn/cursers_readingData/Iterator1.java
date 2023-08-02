package collectionn.cursers_readingData;

import java.util.ArrayList;
import java.util.Iterator;

// it is an interface it has 3 method ->
// hasNext()-> return true false till the time it has elements,
// next() -> return the elements and move the curser to the next element
// remove() -> to remove the elements from collection
// with the help of iterator we can iterate(read) the elements and while iterating we can remove the elements
//Iterartor instance we can get it with method : iterator();
public class Iterator1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(70);
        arrayList.add(8);
        arrayList.add(25);
        arrayList.add(78);
        arrayList.add(26);
        arrayList.add(48);
        arrayList.add(68);

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            Integer integer = (Integer) next; // converted object into Integer
            if (integer == 48) {
                iterator.remove();
            }
        }
        System.out.println(arrayList);
    }

}
//}