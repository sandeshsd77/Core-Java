package class_and_Object;

public class Triangle3 {
    int side1;
    int side2;
    int side3;
int areaPerimeter(int side1, int side2, int side3){
    return side1+side2+side3;
}
    public static void main(String[] args) {
        Triangle3 triangle = new Triangle3();
        triangle.side1=3;
        triangle.side2=4;
        triangle.side3=5;
        System.out.println(triangle.areaPerimeter(triangle.side1, triangle.side2, triangle.side3));

    }
}
