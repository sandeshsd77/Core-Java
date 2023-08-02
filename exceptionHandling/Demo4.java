package exceptionHandling;

public class Demo4 {
    public static void main(String[] args) {
        try {
            System.out.println("**");
            System.out.println("**");
            System.exit(0);
        } catch (Exception ex) {
            System.out.println("catch");
        } finally {
            System.out.println("finally"); // finally block won't be executed when there is call to System.exit(0);
        }
        System.out.println("**");
        System.out.println("**");
        System.out.println("**");
    }
}

