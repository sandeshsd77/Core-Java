package exceptionHandling;

public class Demo15 {
    public static void main(String[] args) {
        try {
            System.out.println(divide2(10,0));
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Invalid denominator");
        }
    }

    private static int divide2(int number1, int number2) throws ArithmeticException {
        return number1 / number2;
    }

}
