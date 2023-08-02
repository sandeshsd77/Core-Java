package array.ArrayDay1;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        int [] array = {1,1,5,5,4,6,8,8,2,3,7,4,6};
        Set<Integer> set = new HashSet<>();
        for (int index = 0; index <array.length ; index++) {
            set.add(array[index]);
        }
        for (int i:set){
            System.out.println(i);
        }
    }
}
