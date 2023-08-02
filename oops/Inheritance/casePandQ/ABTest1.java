package oops.Inheritance.casePandQ;

public class ABTest1 {
    public static void main(String[] args) {


    A a = new A();
    B b = new B();
    b.m1(500);
//     System.out.println(b.m1(500));


    A ab = new B();//Parent class reference = child class object
    //CTE//B ba = new A();// Child class reference = Parent class Object
}

}
/*output=
A class constructor
A class constructor
B Child class
500
200
100
A class constructor
B Child class*/