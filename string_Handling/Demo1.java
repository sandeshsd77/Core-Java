package string_Handling;

public class Demo1 {
    public static void main(String[] args) {
        //new keyword way object creation
        String str1 = new String("abc");
        str1.concat("sd");

        String str2 = new String( str1+" abcde");
        String str3 = new String("abc");
        String str4 = new String("abc");
        String str5 = new String("abc");
        System.out.println(str4.equals(str5));

        System.out.println(str1);
        System.out.println(str5);//it prints the string content
        System.out.println(str5.length()); // 3
        System.out.println(str2.toString()); //abc abcde
    }
}
// output : abc
//           3
//    abc abcde