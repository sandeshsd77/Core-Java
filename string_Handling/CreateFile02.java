package string_Handling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class CreateFile02 {
    public static void main(String[] args) throws IOException {
        File oldfile = new File("src/fileHandling/Demo1CreateFile");
        File newFileLocation = new File("src/fileHandling/CreateFolder");
//      File newFile = new File(newFileLocation.toURI());
      boolean moved = oldfile.renameTo(newFileLocation);

    }
}
