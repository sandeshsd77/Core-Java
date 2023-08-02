package practice;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many numbers you want to calculate average ");
        int number = scanner.nextInt();
        System.out.println("Enter the numbers ");
        for (int i = 1; i <= number; i++) {
            sum = sum+scanner.nextInt();
        }
        System.out.println("sum= "+sum);
        float average = sum/number;
        System.out.println("Average= "+average);
    }
}