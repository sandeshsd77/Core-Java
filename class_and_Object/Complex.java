package class_and_Object;

import java.util.Scanner;

/*Print the sum, difference and product of two complex
numbers by creating a class named 'Complex' with separate
 methods for each operation whose real and imaginary parts
  are entered by user.*/
public class Complex {
    int number1;
    int number2;
    Complex (int n1, int n2){
        number1 = n1;
        number2 = n2;
    }
    int sum (){
        return number1+number2;
    }
    int difference (){
        return number1-number2;
    }
    int product (){
        return number1*number2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two Complex Number ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        Complex comp = new Complex(number1,number2);
        System.out.println("Sum= "+ comp.sum());
        System.out.println("difference = "+ comp.difference());
        System.out.println("Sum= "+ comp.product());

    }


}
