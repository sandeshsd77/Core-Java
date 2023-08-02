package oops.anonymousClass;

public class Calc extends Cal {
    @Override
    int calculator(int number1, int number2) {
        return number1+number2;
    }

    public static void main(String[] args) {
        Cal cal = new Calc();
        System.out.println("Addition "+cal.calculator(10,20));
    }
}
