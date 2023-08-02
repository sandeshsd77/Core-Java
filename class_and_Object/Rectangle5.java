package class_and_Object;
//Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively
// by creating a class named 'Rectangle' with a method named 'Area' which returns
// the area and length and breadth passed as parameters to its constructor.
public class Rectangle5 {
    int length;
    int width;
    void area(int l, int w){
        length = l;
        width = w;
    }
    int getArea(){
        return length*width;
    }

    public static void main(String[] args) {
    Rectangle5 rectangle = new Rectangle5();
    rectangle.area(rectangle.length,rectangle.width);
    rectangle.length = 5;
    rectangle.width = 8;
        System.out.println(rectangle.getArea());

    }
}
