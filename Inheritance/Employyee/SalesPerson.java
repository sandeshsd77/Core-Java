package Inheritance.Employyee;

import java.util.Scanner;

public class SalesPerson extends Salary {
    int sales;
    int commission;

//    public SalesPerson(int sales, int commission) {
//        this.sales = sales;
//        this.commission = commission;
//    }

    public int computeSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sales= ");
        int sales = scanner.nextInt();
       SalesPerson s = new SalesPerson();

//        int totalSalary;
//        if(sales > 15){
//            commission +=5;
//            totalSalary = s.getSalary() + commission;
//        }
        int totalSalary=1;
        if(sales > 15) {
            for(;totalSalary <=1;){
                commission +=5;
               totalSalary =  s.getSalary() + commission;

            }
        }


        return totalSalary;
    }


    public static void main(String[] args) {
        SalesPerson s = new SalesPerson();
        s.getSalary();
        System.out.println("total Salary with commision "+s.computeSalary());

    }
}