package stringHandling;

public class Demo3 {
    public static void main(String[] args) {
        String str = "Welcome to Pune";
        System.out.println(10 + 20 + str);
        System.out.println(10 + "abd");
        System.out.println(str.concat("30"));

        String message = "Good Morning";
       message = message.concat(" Sir");
        System.out.println(message);// Good morning Sir
    }
}
