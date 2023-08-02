package fileHandling;

import java.io.File;

public class FolderDir {
    public static void main(String[] args) {
        File file = new File("src/fileHandling");
        String[] list = file.list();
        for (int i = 0; i < list.length ; i++) {
            File s1=new File("src/fileHandling",list[i]);
            if(s1.isFile())
            System.out.println(list[i]);
        }
    }
}
// output :
// CheckNumberofFiles.java
//CreateFolder2.java
//DeleteFile.java
//DeleteFolder.java
//Demo1CreateFile.java
//Demo2CreateFolder.java
//FileLength.java
//FolderDir.java
//FolderLength.java
//ListFolderwithLength.java
//RenameFile.java
//RenameFolder.java
//Student22