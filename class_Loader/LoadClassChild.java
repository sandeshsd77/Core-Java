package class_Loader;

import oops.Inheritance.casePandQ.Child;

public class LoadClassChild extends LoadClassParent{
    public LoadClassChild() {
        System.out.println("No args Constructor of child class");
    }

    {
        System.out.println("instance block of ChildLoadclass");
    }
    static {
        System.out.println("Static block of child class");
    }

    @Override
    void m1() {
        System.out.println("m1 from childClassLoader");
    }
}
