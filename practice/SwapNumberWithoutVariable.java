package practice;

public class SwapNumberWithoutVariable {
    public static void main(String[] args) {
        int a = 7;
        int b = 15;
        System.out.println("Before Swapping " + a + "\t" + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping " + a + "\t" + b);
    }
}
