package array.ArrayDay1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//How to convert Array to List
public class ArrayString_List {
    public static void main(String[] args) {
        String [] array = {"abc","adc","asd","sde"};
        System.out.println(Arrays.toString(array));
        List <String> list = new ArrayList<String>();
        for (String lists :array){
            list.add(lists);
        }
        System.out.println(list);
    }
}
