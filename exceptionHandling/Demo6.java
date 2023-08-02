package exceptionHandling;

public class Demo6{
    public static void main(String[] args) {
        try {
            System.out.println(10/0); //Invalid denominator
            int[] array = {1};
            System.out.println(array[0]);
            String str = "Null";
            System.out.println(str.toString());
        }catch (ArithmeticException arithmeticException){
            System.out.println("Invalid denominator");
        }
        System.out.println("rest of the code");
    }
}
