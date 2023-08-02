package fileHandling;

import java.io.File;

public class CreateFolder2 {
    public static void main(String[] args) {
        File newFolder = new File("src/fileHandling/Student232");
        boolean folder =newFolder.mkdir();
        System.out.println(folder);
    }
}
