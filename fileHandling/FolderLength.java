package fileHandling;

import java.io.File;
import java.io.IOException;

public class FolderLength {
    public static void main(String[] args) throws IOException {
        File file = new File("src/fileHandling");
       long length = file.length();
        System.out.println(length);
    }
}
