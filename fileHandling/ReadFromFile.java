package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        File file = new File("abd.txt");
        // read data from file in terms of byte
        FileInputStream fileInputStream = new FileInputStream(file);
        int data = fileInputStream.read();
        while (data != -1) {
            System.out.println((char) data);
            data = fileInputStream.read();
        }
        fileInputStream.close();
        System.out.println("File read is complete");
    }
}
