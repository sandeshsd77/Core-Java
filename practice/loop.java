package practice;

public class loop  {
//    to find the factors and perfect number
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1 ; i<=n/2 ; i++){
            if (n%i==0){
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println( "sum of factor "+ sum);
        System.out.println( (sum==n)? "perfect number" : "not perfect");
    }
}
