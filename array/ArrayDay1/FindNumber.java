package array.ArrayDay1;

import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of number= ");
        int size = sc.nextInt();
        int number[] = new int[size];
        //input
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        //output
        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("Number found at index : " + i);
            }
        }
    }
}