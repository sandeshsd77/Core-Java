package stringHandling;

public class upperLowerCase {
    public static void main(String[] args) {
        // making upperCase
        String str = "Hello Sandesh";
        str=str.toUpperCase();
        System.out.println(str); //HELLO SANDESH
        System.out.println("Convert back to lowercase");
        // making lowerCase
        str=str.toLowerCase();
        System.out.println(str); //hello sandesh


        String str1 = "Hello Sir Good Moring";
        str1 = str1.replace("Hello","Hi");
        System.out.println(str1);

        String str2 = "  Hello Sir Good Moring  ";
        str2 = str2.trim();
        System.out.println("Space length : "+str2.length());
        System.out.println(str2);
    }
}
