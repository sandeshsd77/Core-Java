package fileHandling;

import java.io.File;

public class CheckNumberofFiles {
    public static void main(String[] args) {
        File file = new File("src/fileHandling");
        String[] list = file.list();
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            File s1 = new File("src/fileHandling", list[i]);
            if (s1.isFile())
                //  System.out.println(list[i]);
                count++;
        }
        System.out.println(count);
    }
}
