package methods;

import java.util.Scanner;

public class Assign8 {
    static int marks;
    static void grades(int marks) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks = ");
            marks = sc.nextInt();


        if (marks > 91 && marks < 100) {
            System.out.println("AA");
        }
        if (marks > 81 && marks < 90) {
            System.out.println("AB");
        }
        if (marks > 71 && marks < 80) {
            System.out.println("BB");
        }
        if (marks > 61 && marks < 70) {
            System.out.println("BC");
        }
        if (marks > 51 && marks < 60) {
            System.out.println("CD");
        }
        if (marks > 41 && marks < 50) {
            System.out.println("DD");
        }
        if (marks > 0 && marks < 40) {
            System.out.println("Fail");
        }

    }

    public static void main(String[] args) {
//        Assign8 obj = new Assign8();


        Assign8.grades(marks);
    }

}

