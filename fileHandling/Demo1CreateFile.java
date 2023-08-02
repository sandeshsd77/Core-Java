package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo1CreateFile {
    public static void main(String[] args) throws IOException{
        File file = new File("abcd.txt");
        boolean newFile= file.createNewFile();
        System.out.println("Is new file crated : "+ newFile);
    }
}

//Is new file crated true

