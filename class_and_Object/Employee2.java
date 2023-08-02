package class_and_Object;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Employee2 {
    int salary;
    int noWork;

    void setEmployeeInformation(int salary, int noWork) {
        this.salary = salary;
        this.noWork = noWork;
        System.out.println("Salary :" + this.salary + "\tNo Of Work  :" + this.noWork);
    }

    int addSal(int salary) {
        if (salary < 500) {
            salary += 10;
        }
        return salary;
    }


    int addWork(int noWork) {
        if (noWork > 6) {
            salary += 5;
        }
        return salary;
    }

    public static void main(String[] args) {
        Employee2 emp = new Employee2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary= ");
        emp.salary = scanner.nextInt();
        System.out.println("Enter Working Hours= ");
        emp.noWork = scanner.nextInt();
//        emp.setEmployeeInformation(emp.salary, emp.noWork);
        System.out.println(emp.addSal (emp.salary));
        System.out.println(emp.addWork(emp.noWork));
    }


}
