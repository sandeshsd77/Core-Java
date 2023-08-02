package fileHandling.read_write_File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileInByte {
    public static void main(String[] args) throws IOException {
        File file = new File("java.txt");
        file.createNewFile();
        System.out.println("File is created");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        for (int i = 66; i < 99; i++) {
            fileOutputStream.write(i);
        }
        fileOutputStream.close();
        System.out.println("File Write is Complete");
    }
}
