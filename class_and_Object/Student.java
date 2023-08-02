package class_and_Object;

public class Student {
    String name;
    int rollno;

    public static void main(String[] args) {
        Student student = new Student ();
//        System.out.println(student.name + "\t"+student.rollno);
        student.name="john";
        student.rollno=2;
        System.out.println("Name of student= "+student.name + "\t"+ "Roll No of Student= "+student.rollno);

    }

}
