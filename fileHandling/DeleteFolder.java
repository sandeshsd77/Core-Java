package fileHandling;

import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        File folder = new File("Student2");
        boolean delete = folder.delete();
        System.out.println(delete);
    }
}
