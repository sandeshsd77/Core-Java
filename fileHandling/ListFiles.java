package fileHandling;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File folder = new File("src/fileHandling");
        File [] allfiles = folder.listFiles(file ->file.length()>100);
        for (File file:allfiles) {
            System.out.println(file.getName()+"\t"+file.length());
        }
    }
}
