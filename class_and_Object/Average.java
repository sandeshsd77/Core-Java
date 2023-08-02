package class_and_Object;

import java.util.Scanner;

/*1. Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average
        - Assignment - 08*/
public class Average {
    int number1;
    int number2;
    int number3;

    void Numbers(int n1, int n2, int n3) {
        number1 = n1;
        number2 = n2;
        number3 = n3;
    }

    double calculateAverage() {
        return (number1 + number2 + number3) / 3;
    }

    public static void main(String[] args) {
        Average average = new Average();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three Number ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        average.Numbers(number1, number2, number3);
        System.out.println("Average of three numbers ="+average.calculateAverage());
    }
}

