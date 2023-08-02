package class_and_Object;

import java.util.Scanner;

public class Employee {

    String name;
    int year;
    String address;
    Employee (String n1, int y1, String add){
        name=n1;
        year=y1;
        address=add;
    }
     String getName(){
        return name;
    }
    int Year(){
        return year;
    }
    String getAddress(){
        return  address;
    }

    public static void main(String[] args) {
       Employee e1 = new Employee("Robert", 1994, "64C-WallStreet");
       Employee e2 = new Employee("Sam", 2000, "68D-WallStreet");
       Employee e3 = new Employee("John", 1999, "26B-WallStreet");
        System.out.println("Name "+"\t"+"J "+"\t"+"Address");
        System.out.println(e1.getName()+ "\t"+ e1.Year()+"\t"+"\t"+e1.getAddress());
        System.out.println(e2.getName()+ "\t"+"\t"+ e2.Year()+"\t"+"\t"+e2.getAddress());
        System.out.println(e3.getName()+ "\t"+ e3.Year()+"\t"+"\t"+e3.getAddress());

    }
}
