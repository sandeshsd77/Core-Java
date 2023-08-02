package methods;

import java.util.Scanner;

public class Assign4 {
    static int add(int number1, int number2) {
        return number1+number2;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two Numbers ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("addition of two number= " + add(number1, number2));

    }

}
