package fileHandling.read_write_File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFileCharacter {
    public static void main(String[] args) throws IOException {
        File file = new File("Oops.txt");
        file.createNewFile();
        System.out.println("File is Created");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("hello");
        fileWriter.close();
        System.out.println("File Write is Completed");
    }
}
