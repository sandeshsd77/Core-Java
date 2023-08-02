package collectionn.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceCharacterDemo2 {
    public static void main(String[] args) {
        String str = "Welcome to the it shaala";
        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (characterIntegerMap.containsKey(ch)) {
                characterIntegerMap.put(ch, characterIntegerMap.get(ch) + 1);
            } else {
               characterIntegerMap.put(ch, 1);
            }
        }
        characterIntegerMap.entrySet().forEach(System.out::println);
    }
}
