package practiceNew;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 10;
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(number+" is Prime number");
        }
//            System.out.println(isPrime ? "prime" : "NotPrime");
    }
}
