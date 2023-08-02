package collectionn.arrayList;

import collectionn.arrayList.Student;

import java.util.*;

public class SortStudent {public static void main(String[] args) {
    Student student1 = new Student(3, "Vaibhavv", 85);
    Student student2 = new Student(8, "Sandesh", 35);
    Student student3 = new Student(2, "Aditiiii", 70);
    Student student4 = new Student(6, "Navnath", 55);

    List<Student> students = new ArrayList<>();
    students.add(student1);
    students.add(student2);
    students.add(student3);
    students.add(student4);



        Collections.sort(students, (std1, std2) -> std1.getStudentId() - std2.getStudentId());
//        Collections.sort(students, (std1, std2) -> std1.getStudentName().length() - std2.getStudentName().length());
//    Collections.sort(students, (std1, std2) -> std1.getStudentName().compareTo(std2.getStudentName()));
    for (Student std : students) {
        System.out.println(std);
    }

}
}
