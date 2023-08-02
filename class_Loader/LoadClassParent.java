package class_Loader;

public class LoadClassParent {
    static {
        System.out.println("Static block of LoadClass");
    }
    {
        System.out.println("Instance Block of LoadClass");
    }
    private  int studentId;
    private  String studentName;

    @Override
    public String toString() {
        return "LoadClass{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
    void m1(){
        System.out.println(" m1 from parent class");
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

    public LoadClassParent(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public LoadClassParent() {
    }
}
