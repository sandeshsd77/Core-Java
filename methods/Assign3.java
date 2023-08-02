package methods;

import java.util.Scanner;

public class Assign3 {
    static int vote(int age1) {

        if (age1 >= 18) {
            System.out.println("eligible for vote");
        }
        else
            System.out.println("is not eligible for vote");
        return age1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age1 = scanner.nextInt();
        System.out.println(vote(age1));
    }
}
