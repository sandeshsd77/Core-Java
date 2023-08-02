package fileHandling;

import java.io.File;

public class FileLength {
    public static void main(String[] args) {
        File file = new File("src/filehandling/DeleteFile.java");
        long length = file.length();
        System.out.println("file length : "+length);
    }
}
