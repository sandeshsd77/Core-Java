package collectionn.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//map -> is interface which implemented by hashmap,linkedhashmap, treemap store element in form on key and value
// hashmap -> no insertionorder/sorting order 2.unique elements store 3.only once null add
// linkedhashmap -> maintain insertion order but no sorting order 2.unique elements store 3.only once null add
public class MapDemo2 {
    public static void main(String[] args) {
//        Map map = new HashMap<>();
        Map map = new LinkedHashMap();
        map.put(5,"abc");
        map.put(1,"xyz");
        map.put(9,"pqr");
        map.put(5,"spq");
        map.put(3,"klm");
        map.put(7,"abc");

        System.out.println(map.get(9));
        System.out.println(map.keySet());
        System.out.println(map.values());

//        System.out.println(map.entrySet());
        map.entrySet().forEach(System.out::println);


    }
}
