package methods;

public class Assign12 {
    void getFibonacci() {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i <= 3; i++) {

            System.out.println(c);
            a = b;
            b = c;
            c = a + b;
        }
    }

    public static void main(String[] args) {
        Assign12 fib = new Assign12();
        fib.getFibonacci();
    }
}
