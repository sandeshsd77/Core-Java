package Inheritance.Employyee;

import java.util.Scanner;

public class Salary {
    static int  salary;

//    public  Salary(int salary) {
//        this.salary = salary;
//    }
        int getSalary(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Empolyee Name of employee= ");
            String name= scanner.nextLine();
            System.out.println("Enter your age= ");
            int age= scanner.nextInt();
            System.out.println("Enter number of Hours worked = ");
            int hrs = scanner.nextInt();
            System.out.println("Enter hourly rate= ");
            int rate = scanner.nextInt();
            WageEmployee wageEmployee = new WageEmployee(name,age,hrs,rate);
            salary = wageEmployee.computeSalary();
            System.out.println("Total Salary of Employee is= "+ salary);
            return salary;
    }
//    public static void main(String[] args) {
//
//    }
}
