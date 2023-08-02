package fileHandling;

import java.io.File;

public class FileNames {
    public static void main(String[] args) {
        File file = new File("src/Methods");
        String[] fileNames =file.list();
       for (String fileName:fileNames){
            System.out.println(fileName);
        }
    }
}
