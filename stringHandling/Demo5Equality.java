package stringHandling;

public class Demo5Equality {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = new String("pqr");
        String str4 = new String("pqr");
        String str5="abc";
        String str6="abc";
        String str7="pqr";
        String str8="pqr";
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str5);

        //equals method is overriden inside the String class. It checks the content of the String class object
        System.out.println(str1.equals(str5));
        System.out.println(str2.equals(str3));
        System.out.println(str1.equals(str8));


    }
}
