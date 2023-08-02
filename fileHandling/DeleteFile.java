package fileHandling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("aaa.txt");
        boolean delete = file.delete();
        System.out.println(delete);
    }
}
