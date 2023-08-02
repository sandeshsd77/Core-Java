package oops.Inheritance.casePandQ;

public class P {
    int a = 200;

    static {
        System.out.println(" P Static block");
    }

    {
        System.out.println("P Instance block");
    }

    P() {
        System.out.println(" P Constructor");
    }

    void m1() {
        System.out.println("m1 from P class");
    }
}
