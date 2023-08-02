package fileHandling;

import java.io.File;

public class PrintNameUSingFilter {
    public static void main(String[] args) {
        File file = new File("src/fileHandling");
        String [] fileName = file.list((dir, name) -> name.startsWith("F"));
        for (String s:fileName) {
            System.out.println(s+"\t"+s.length());
        }
    }
}
