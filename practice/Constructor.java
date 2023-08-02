package practice;

public class Constructor {
   static int n1;
    static int n2;

    public Constructor(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor(5,4);
        System.out.println(n1+n2);
    }
}
