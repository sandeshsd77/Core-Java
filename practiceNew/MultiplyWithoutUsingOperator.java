package practiceNew;

public class MultiplyWithoutUsingOperator {
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 2;
        int product = 0;
        for (int i = 1; i <= number1; i++) {
            product = product + number2;
        }
            System.out.println(product);
    }
}
