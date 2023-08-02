package exceptionHandling;

import java.io.FileInputStream;

public class Demo16 {
    public static void main(String[] args) {
//            FileInputStream fileInputStream = new FileInputStream("d:/abc.text");
        try {
            FileInputStream fileInputStream = new FileInputStream("d:/abc.text");
        } catch (Exception exception) {
            System.out.println("no such feild is there");
        }
    }

}