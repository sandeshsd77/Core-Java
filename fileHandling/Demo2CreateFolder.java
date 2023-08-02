package fileHandling;

import java.io.File;

public class Demo2CreateFolder {
    public static void main(String[] args) {
        File folder = new File("Student");
        boolean newFolder = folder.mkdirs();
        System.out.println(newFolder);
    }
}
