package practice;

import java.util.Scanner;
//a whole number greater than 1 whose only factors are 1 and itself
public class Prime {
    public static void main(String[] args) {
        int n, count=0;
        System.out.println("Enter any number ");
        Scanner scanner= new Scanner(System.in);
        n= scanner.nextInt();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println(n+ " Prime number ");
        }
        else {
            System.out.println(n+ " Not Prime Number");
        }
    }
}
