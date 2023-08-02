package fileHandling.read_write_File;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDatainCharacters {
    public static void main(String[] args) throws IOException {
        File file = new File("abd.txt");
//        read data from file in terms of character
        FileReader fileReader = new FileReader(file);
       int character = fileReader.read();
       while (character!=-1){
           System.out.println((char) character);
           character=fileReader.read();
       }
       fileReader.close();
        System.out.println("File reader is complete");

    }
}
