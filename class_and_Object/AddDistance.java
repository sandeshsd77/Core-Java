package class_and_Object;

import java.util.Scanner;

//Add two distances in inch-feet by creating a class named 'AddDistance'
public class AddDistance {
    int inch;
    int feet;
    public AddDistance(int inch, int feet) {
        this.inch = inch;
        this.feet = feet;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Inches ");
        int inch = scanner.nextInt();
        System.out.println("Enter the feet ");
        int feet = scanner.nextInt();
        AddDistance d = new AddDistance(inch,feet);
        int feetinInch = d.inch/12;
        int inchinFeet = d.feet*12;
        System.out.println( "Inches in feet= "+feetinInch);
        System.out.println("Feet in Inches= "+inchinFeet);


    }


}
