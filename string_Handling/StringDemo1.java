package string_Handling;

public class StringDemo1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1;

        str1 = str1 + " World";

        System.out.println(str1); // Output: Hello World
        System.out.println(str2); // Output: Hello

    }
}