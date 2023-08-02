package practice;

import java.util.Scanner;

public class Grade {

     void grades() {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your marks ");
        int marks = scanner.nextInt();

        if (marks >= 91 && marks <= 100) {
            System.out.println("AA");
        }
        if (marks >= 81 && marks <= 90) {
            System.out.println("AB");
        }
        if (marks >=71 && marks <= 80) {
            System.out.println("BB");
        }
        if (marks >= 61 && marks <= 70) {
            System.out.println("BC");
        }
        if (marks >= 51 && marks <= 60) {
            System.out.println("CD");
        }
        if (marks >= 41 && marks <= 50) {
            System.out.println("DD");
        }
        if (marks >= 0 && marks <=40) {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Grade obj1 = new Grade();

       obj1.grades();
}
}

