package fileHandling.read_write_File;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileINCharacter{
    public static void main(String[] args)  throws IOException {
        File file = new File("Oops.txt");
        FileReader fileReader = new FileReader(file);
     int data = fileReader.read();
     while (data!=-1){
         System.out.print((char) data);
         data = fileReader.read();
     }
         fileReader.close();
        System.out.println();
        System.out.println("File read is Completed");
    }
}
