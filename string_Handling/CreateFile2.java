package string_Handling;

import java.io.File;
import java.io.IOException;

public class CreateFile2 {
    public static void main(String[] args)throws IOException {
        File file = new File("pqr.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }
}
