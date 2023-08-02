package exceptionHandling;

public class Demo3 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 2);
            int[] array = {};
            System.out.println(array[0]);

        } catch (ArithmeticException arithmeticException) {
            System.out.println("Invalid denominator");
        } finally {
            System.out.println("finally");
        }

        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
    }
}

//5
//finally
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//	at ExceptionHandling.Demo3.main(Demo3.java:8)

/*If there is no exception thrown in the try block, then the finally block will be executed immediately after the try block completes.

If an exception is thrown in the try block and it is caught by a catch block, then the finally block will be executed immediately after the catch block completes.

If an exception is thrown in the try block and it is not caught by any catch block, then the finally block will be executed before the exception is propagated up the call stack.*/