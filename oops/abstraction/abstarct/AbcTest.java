package oops.abstraction.abstarct;

public class AbcTest {
    public static void main(String[] args) {
        C c =new C();
        System.out.println("Instance variable of C : "+c.a);
        c.m1();
        c.m2();
        c.display();

        A ac =new C();
        System.out.println("Instance variable of A"+ac.a);
        ac.m1();
//        ac.m2(); //CTE
        // P --> P
        //C --> CTE
        //PC ---> V-P, M-C
//
        B bc=new C();
        bc.m1();
        bc.m2();
        System.out.println("Instance variable of B"+bc.a);
    }
}
