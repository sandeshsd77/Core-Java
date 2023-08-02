package oops.abstraction.interfaceDemo;

import oops.multipleInheritance.I1;

public class Child implements I1,I2 {
    @Override
    public void m2() {
        System.out.println("m2");
    }

    @Override
    public void m1() {
        System.out.println("m1");
    }
}
