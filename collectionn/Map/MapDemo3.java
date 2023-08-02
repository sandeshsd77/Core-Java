package collectionn.Map;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("abg","pqr");
        map.put(8,"bcd");
        map.put(6,"xyz");
        map.put(3,"abc");
        map.put(2,"edf");
        map.put(null,"dgsg");

        System.out.println(map.keySet());
        for (Object key: map.keySet()) {
            System.out.println(key+"\t"+map.get(key));
        }
    }
}
