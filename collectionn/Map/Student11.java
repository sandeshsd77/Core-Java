package collectionn.Map;

public class Student11 {
    private int studentRollNumber;
    private String studentName;

    public Student11() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentRollNumber=" + studentRollNumber +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    public int getStudentRollNumber() {
        return studentRollNumber;
    }

    public void setStudentRollNumber(int studentRollNumber) {
        this.studentRollNumber = studentRollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Student11(int studentRollNumber, String studentName) {
        this.studentRollNumber = studentRollNumber;
        this.studentName = studentName;
    }
}
