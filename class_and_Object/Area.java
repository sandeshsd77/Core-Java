package class_and_Object;

import java.util.Scanner;

public class Area {
    int length;
    int breadth;

    void setDim(int l, int b) {
        length = l;
        breadth = b;
    }

    int getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two Values ");
        Area area = new Area();
        area.setDim(area.length, area.breadth);
        area.length = scanner.nextInt();
        area.breadth = scanner.nextInt();
        System.out.println( area.getArea());


    }

}

/*1. Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
        2. First method named as 'setDim' takes length and breadth of rectangle as parameters and
        the second method named as 'getArea' returns the area of the rectangle.
        3. Length and breadth of rectangle are entered through keyboard.*/
