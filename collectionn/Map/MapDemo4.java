package collectionn.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        for (int i = 1; i <= 10; i++) {
            map.put(i, i + "abc");
        }
        map.put(null,"null");
//        for (Object key:map.entrySet()) {
//            System.out.println(key+": "+map.get(key));
//        }
        System.out.println(map.get(8));

        map.entrySet().forEach(System.out::println);
    }
}
