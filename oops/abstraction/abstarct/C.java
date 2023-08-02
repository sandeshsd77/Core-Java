package oops.abstraction.abstarct;

public class C extends B {
   int a = 1000;

    public C() {
        super();
        System.out.println("C class Constructor ");
    }

    @Override
    public void m1() {
        System.out.println("m1 form C class ");
    }

    @Override
    public void m2() {
        System.out.println("m2 from C class ");
    }
   public void display(){
        System.out.println("Displaying instance variable of C class "+this.a);
        System.out.println("Displaying instance variable of B class "+super.a);
//        System.out.println("Displaying instance variable of A class "+super.super.a);//CTE
        System.out.println("Displaying instance variable of A class "+getA());
    }
}
