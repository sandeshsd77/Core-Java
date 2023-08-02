package class_Loader;

public class LoadClassDemo {
    public static void main(String[] args) {
        // to execute static only static block we load the the class using Class.fornameMethod (PackageName.ClassName)
        try {
            Class.forName("class_Loader.LoadClassParent"); // Checked Exception occur when call to fornameMethod
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("Class not found " + classNotFoundException + classNotFoundException.getMessage());
        }
        //We only load the class in the memory
        // we avoid unnecessary object creation, constructor call, instance execution
    }
}
