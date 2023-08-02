package collectionn.cursers_readingData;



import java.util.ArrayList;
import java.util.Iterator;

    public class IteratorExample {
        public static void main(String[] args) {

            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(70);
            arrayList.add(8);
            arrayList.add(25);
            arrayList.add(78);
            arrayList.add(26);
            arrayList.add(48);
            arrayList.add(68);

            Iterator<Integer> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }

