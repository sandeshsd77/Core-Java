package Inheritance.Employyee;

public class Employee {
    String name;
    int age;

//    public Employee() {
//    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
/*Create
class WageEmployee extending Employee class with attributes as hrs (int)and
        rate(int) and method computeSalary() to calculate the salary.Print the salary
        and details of WageEmployee.

        (Note:
        Use the previous date and Employee classes. Accept the values from the
        user..Default, Parameterised Constructor and toString() to be written in all
        the classes)*/