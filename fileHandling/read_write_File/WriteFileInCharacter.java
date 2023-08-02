package fileHandling.read_write_File;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileInCharacter {
    public static void main(String[] args) throws IOException {
        File file = new File("abd.txt");
        // Write a file in terms of Characters
        FileWriter fileWriter = new FileWriter(file );
        fileWriter.write("We are able to write");
        fileWriter.close();
        System.out.println("File write  is complete");
    }
}
