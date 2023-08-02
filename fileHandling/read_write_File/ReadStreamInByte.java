package fileHandling.read_write_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadStreamInByte {
    public static void main(String[] args) throws IOException {
        File file= new File("studentData.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
       int data = fileInputStream.read();
       while(data!=-1){
           System.out.println((char) data);
           data = fileInputStream.read();
       }
       fileInputStream.close();
        System.out.println("File Read is Complete");
    }
}
