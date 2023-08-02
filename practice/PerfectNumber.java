package practice;

import java.util.Scanner;

//        perfect number, a positive integer that is equal to the
//        sum of its proper divisors. 28/496/128
public class PerfectNumber {
    public static void main(String[] args) {

        int n, sum = 0;
        System.out.println("Enter the number ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (n == sum) {
            System.out.println(n + " Perfect Number ");
        } else {
            System.out.println(n + " not Perfect Number ");
        }
    }
}
