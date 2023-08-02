package miniProjects;

import java.util.Scanner;

class Calculator {
       static int add(int n1, int n2) {
        return n1 + n2;
    }

    static int subtract(int n1, int n2) {
        return n1 - n2;
    }

    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public int devisionQuotient(int n1, int n2) {
        return n1 / n2;
    }

    public int devisionRemainder(int n1, int n2) {
        return n1 % n2;
    }
}

public class Calculator01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two numbers ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        Calculator obj = new Calculator();
        int r1=obj.add(n1,n2);
//
//        System.out.println(add(n1,n2));
////
//        System.out.println(subtract(n1,n2));
        System.out.println("Addition of two number " + r1);

        int r2 = obj.subtract(n1, n2);
        System.out.println("Subtractiontion of two number " + r2);

        int r3 = obj.multiply(n1, n2);
        System.out.println("Multiplication of two number " + r3);

        int r4 = obj.devisionQuotient(n1, n2);
        System.out.println("Division of two number " + r4);

        int r5 = obj.devisionRemainder(n1, n2);
        System.out.println("Remainder of two number " + r5);

////
    }
}