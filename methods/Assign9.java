package methods;

import java.util.Scanner;

public class Assign9 {

  static void factorial(int number){
//  static  int  factorial(int number){
      int product=1;

        for (int i=1;i<=number;i++){
            product=product*i;
        }
      System.out.println(product);
//        return product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scanner.nextInt();
        factorial(number);

    }
}
