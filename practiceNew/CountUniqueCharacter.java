package practiceNew;

import java.util.HashSet;
import java.util.Set;

public class CountUniqueCharacter {
    public static void main(String[] args) {
        String str = "sandeshh";
        int count = 0;
        Set <Character> uniqueChar = new HashSet<>();
        for (int i = 0; i <str.length() ; i++) {
            char c = str.charAt(i);
            uniqueChar.add(c);

        }
        for (char c : uniqueChar) {
            count++;
        }
        System.out.println("Number of unique characters: " +count);
    }
}
