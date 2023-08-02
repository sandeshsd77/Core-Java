package collectionn.arrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfOddNumber {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(76);
        integerList.add(87);
        integerList.add(11);
        integerList.add(40);
        integerList.add(14);
        integerList.add(60);
        System.out.println(integerList);
        integerList.removeIf((element) -> element % 2 != 0);
        System.out.println(integerList);
    }
}
