package collectionn.Map;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo5 {
    public static void main(String[] args) {
        Map map = new TreeMap<>();
        map.put(5,"adc");
        map.put(25,"xyz");
        map.put(1,"abc");
        map.put(3,"pqr");
        map.put(45,"def");

        map.entrySet().forEach(System.out::println);
    }
}
