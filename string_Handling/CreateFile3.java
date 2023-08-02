package string_Handling;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class CreateFile3 {
    public static void main(String[] args) throws IOException {
        File file = new File("aaa.txt");
        boolean fileCreated = file.createNewFile();
        System.out.println(fileCreated);
    }
}
