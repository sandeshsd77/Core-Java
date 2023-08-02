package stringHandling;

public class StringintoArrayDemo9 {
    public static void main(String[] args) {
        String str = "Java backend";
        //convert this str into char array
        char[] charArray = str.toCharArray();
        System.out.println(charArray);

        String s1 = "B";
        String s2 = "B";
        System.out.println(s1.compareTo(s2));

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//false

    }
}
