package practice;

public class Factorials {
    public static void main(String[] args) {
        int number = 5;
        int product = 1;
        for (int i = 1; i <= number; i++) {
            product = product * i;
        }
        System.out.println("sum of factorials: " + product);
    }
}
