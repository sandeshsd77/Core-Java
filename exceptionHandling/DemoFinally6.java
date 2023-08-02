package exceptionHandling;

public class DemoFinally6 {
    public static void main(String[] args) {
        try {
//            System.out.println(10 / 0);//5
//            String str = "null";
//            System.out.println(str.length());//4
            int[] array = {};
            System.out.println(array[0]);//AIOBE
        }
        catch (ArithmeticException exception) {
            System.out.println("divide by zero");
        }
        finally {
            //System.exit(0);
            System.out.println("finally is always executed");
        }
        System.out.println("Rest of main method");
    }
}
