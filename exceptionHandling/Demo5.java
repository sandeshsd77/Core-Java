package exceptionHandling;

public class Demo5 {
    public static void main(String[] args) {
        try{
            System.out.println(10/2);
            int [] array = {};
            System.out.println(array[0]);
            String str="null";
            System.out.println(str.length());
        }
        catch (ArithmeticException arithmeticException){
            System.out.println("Invalid Number");
        }
        finally {
            System.out.println("Finally always executed");
        }
        System.out.println("Rest of the Code");
    }
}
