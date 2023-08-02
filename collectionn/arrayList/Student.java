package collectionn.arrayList;

public class Student {
    public Student() {
    }

    int studentId;
    String studentName;
    int studentMarks;

    public Student(int studentId, String studentName, int studentMarks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentMarks = studentMarks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentMarks=" + studentMarks +
                '}';
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(int studentMarks) {
        this.studentMarks = studentMarks;

    }
}
