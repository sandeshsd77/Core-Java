package string_Handling;

import java.io.File;

public class RenameFolder {
    public static void main(String[] args) {
        File folder = new File("Student");
        File newFolder = new File("Student1");
        boolean isNewFolder = folder.renameTo(newFolder);
        System.out.println("Is folder renamed : "+isNewFolder);
    }
}
