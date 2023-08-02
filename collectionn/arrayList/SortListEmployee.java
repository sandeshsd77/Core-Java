package collectionn.arrayList;

import java.util.*;

public class SortListEmployee {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "abc", 15000);
        Employee employee2 = new Employee(3, "xyz", 10000);
        Employee employee3 = new Employee(2, "lmn", 25000);
        Employee employee4 = new Employee(2, "lmn", 25000);
        Employee employee5 = new Employee(5, "mno", 45000);

        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

//        Collections.sort(employeeList,(emp1, emp2) -> (emp1.getEmployeeId() - emp2.getEmployeeId()));

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}