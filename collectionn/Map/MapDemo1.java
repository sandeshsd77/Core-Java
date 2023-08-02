package collectionn.Map;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo1 {
    public static void main(String[] args) {

        Map<String, Integer> student = new TreeMap<>();
        student.put("Sandesh", 80);
        student.put("Sandesh", 85);
        student.put("Aditi", 60);
        student.put("Nikhil", 70);
        System.out.println(student);

        System.out.println(student.get("Sandesh")); // 85

        System.out.println(student.keySet());    // [Aditi, Nikhil, Sandesh]
//        System.out.println(student.entrySet());
        student.entrySet().forEach(System.out::println);
//
//        for (String key :student.keySet()) {
//            System.out.println(key + " : " +student.get(key) );

//     final Output : Aditi : 60
//                    Nikhil : 70
//                    Sandesh : 85
        }

    }
//}
