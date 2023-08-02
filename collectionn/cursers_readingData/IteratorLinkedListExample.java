package collectionn.cursers_readingData;

//import Practice.Main;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorLinkedListExample {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<>();
        linkedList.add(65);
        linkedList.add(30);
        linkedList.add(55);
        linkedList.add(15);
        linkedList.add(15);
        linkedList.add(65);

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
