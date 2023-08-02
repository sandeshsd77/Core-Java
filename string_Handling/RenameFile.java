package string_Handling;

import java.io.File;
import java.io.IOException;

public class RenameFile {
    public static void main(String[] args) throws IOException{
        File oldFile = new File("pqr.txt");
        File newFile = new File("xyz.txt");
        boolean renameTo = oldFile.renameTo(newFile);
        System.out.println("File renamed : "+renameTo);
    }
}
