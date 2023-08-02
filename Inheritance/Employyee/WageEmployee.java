package Inheritance.Employyee;

public class WageEmployee extends Employee {
    int hrs;
    int rate;

//    public WageEmployee() {
//    }

//    public WageEmployee(int hrs, int rate) {
//        this.hrs = hrs;
//        this.rate = rate;
//    }

    public WageEmployee(String name, int age, int hrs, int rate) {
        super(name, age);
        this.hrs = hrs;
        this.rate = rate;
    }

    public int computeSalary() {
        return this.hrs * this.rate;
    }
}


