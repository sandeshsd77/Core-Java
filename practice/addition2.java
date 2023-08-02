package practice;

import java.util.Scanner;

public class addition2 {
  int n1;
  int n2;

    public addition2(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public int add(){
        int r = n1+n2;
        return r;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number1");
        int n1 = scanner.nextInt();
        System.out.println("Enter the number2");
        int n2 = scanner.nextInt();
       int result= calc.add(n1,n2);
        System.out.println(result);

    }
}
