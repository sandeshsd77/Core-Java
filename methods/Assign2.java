package methods;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Assign2 {
    static boolean evenNumber(int number1){
        return number1%2==0;

    }
    static boolean oddNumber(int number2){

        return number2%2!=0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter first the number");
        int number1 = scanner.nextInt();
        System.out.println(" it is a Even Number = " + evenNumber (number1));
        System.out.println("enter second the number");
        int number2 = scanner.nextInt();
        System.out.println(" it is a Odd Number =  " + oddNumber(number2));

    }
}
