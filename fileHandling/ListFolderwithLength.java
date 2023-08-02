package fileHandling;

import java.io.File;

public class ListFolderwithLength {
    public static void main(String[] args) {
        File file = new File("src/Array");
        File[] allFiles = file.listFiles();
        for (int i = 0; i < allFiles.length ; i++) {
            System.out.println(allFiles[i].getName()+"\t"+allFiles.length);
        }
//        for (int i = 0; i < allFiles.length ; i++) {
//  File ref = new File("src/Array",allFiles[i]);
//           if(ref.isFile()){
//               System.out.println(allFiles[i]);
//           }

        }
    }

