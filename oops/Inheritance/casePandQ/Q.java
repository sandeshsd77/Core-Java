package oops.Inheritance.casePandQ;

public class Q extends P{
    int a = 300;

    static {
        System.out.println("Q Static block");
    }

    {
        System.out.println("Q Instance block");
    }

    Q() {
        System.out.println("Q Constructor");
    }

    void m1() {
        System.out.println("m1 from Q class");
    }
}
