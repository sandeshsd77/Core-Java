package stringHandling;

import java.util.Arrays;

public class Demo8 {
    public static void main(String[] args) {
        String str = "Welcome,to,string,handlong";
//        str= Arrays.toString(str.split(","));
        String [] strings = str.split(",");// remove the "," and print string the line by line
        for (String s:strings) {
            System.out.println(s);
        }
    }
}
