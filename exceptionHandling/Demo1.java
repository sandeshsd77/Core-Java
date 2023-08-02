package exceptionHandling;

public class Demo1 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 2);
            int[] array = {};
            System.out.println(array[0]);
        }//default exception handling}
        catch (ArithmeticException arithmeticException) {
            System.out.println("Invalid Denominator");
        } catch (ArrayIndexOutOfBoundsException ref) {
            System.out.println("Array not in range");
        }
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
    }
}