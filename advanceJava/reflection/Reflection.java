package advanceJava.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Class employeeClass = Class.forName("fileHandling.ListFiles");
        String classLoader = employeeClass.getClassLoader().toString();

        Field [] fields = employeeClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        Method [] methods = employeeClass.getMethods();
        for (Method method :methods) {
            System.out.println(method);
        }

    }
}
