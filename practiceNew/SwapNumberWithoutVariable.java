package practiceNew;

public class SwapNumberWithoutVariable {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a ^ b; //
        b = a ^ b; //
        a = a ^ b;
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}


       /* a = a ^ b;  // XOR operation to get the XOR of a and b
        b = a ^ b;  // XOR operation to get the original value of a
        a = a ^ b;  // XOR operation to get the original value of b*/
