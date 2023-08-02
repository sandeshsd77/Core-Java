package string_Handling;

import java.io.File;
import java.io.IOException;

public class CreateFolder2 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/fileHandling/Student22");
        boolean folder = file.createNewFile();
        System.out.println(folder);
    }
}
