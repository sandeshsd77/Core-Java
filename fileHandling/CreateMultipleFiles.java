package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateMultipleFiles {
    public static void main(String[] args) throws IOException {
        for (int index = 0; index <=3 ; index++) {
            File file = new File("studentDetails"+index+".txt");
            file.createNewFile();
        }
        System.out.println("100 Files Created");
        }
}
