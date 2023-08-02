package methods;

import java.util.Scanner;

public class Assign5 {
    static int product(int n1,int n2){
        return n1*n2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println("Product of two number "+product(n1,n2));
    }
}
