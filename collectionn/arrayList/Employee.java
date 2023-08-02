package collectionn.arrayList;

public class Employee {
    int employeeId;
    String employeeName;
    int employeeSalary;

    public Employee(int employeeId, String employeeName, int employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }

//    @Override
//    public int compareTo(Employee emp) {
////      return  this.employeeSalary-emp.employeeSalary;
////      return  this.employeeId-emp.employeeId;
//        return this.employeeName.compareTo(emp.employeeName);
////      return  this.employeeName.length()-(emp.employeeName.length());
//    }
}
