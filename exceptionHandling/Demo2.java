package exceptionHandling;

public class Demo2 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            int [] array = {};
            System.out.println(array[0]);
        } catch (ArithmeticException arithmeticException){
            System.out.println("invalid denominator");
        } catch (Throwable throwable){
            System.out.println("generic exception handler");
        }
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
    }
}
