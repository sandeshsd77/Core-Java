package oops.callbyValue;

public class Test {
    void multiply(int x, int y){
        x=10;
        y=5;
        System.out.println(x*y);

    }
    public static void main(String[] args) {
        int a=20;
        int b=40;
        Test test = new Test();
        test.multiply(20,40);
        System.out.println(a+" "+b);
    }
}
