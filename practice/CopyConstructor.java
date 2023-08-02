package practice;

public class CopyConstructor {
    int a;
    int b;

    public CopyConstructor(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public CopyConstructor(CopyConstructor copyConstructor) {
        int a1 = copyConstructor.a;
        int b1 = copyConstructor.b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public static void main(String[] args) {
        CopyConstructor copyConstructor = new CopyConstructor(10, 20);

        CopyConstructor copyConstructor2 = new CopyConstructor(copyConstructor);

        System.out.println("Persoin1 "+ copyConstructor.getA()+ copyConstructor.getB());
        System.out.println("Persoin2 "+ copyConstructor2.getA()+copyConstructor2.getB());
    }
}
