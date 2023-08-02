package methods;

import java.util.Scanner;

public class Assign6 {
    static double circumference(int radius){

        return 2*3.14*(radius*radius);
    }
    static double areaOfCircle(int radius){
        return 3.14159*(radius*radius);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius ");
        int radius = scanner.nextInt();
        System.out.println("Circumference = "+ circumference(radius));
        System.out.println("area circle = "+ areaOfCircle(radius));
    }
}
