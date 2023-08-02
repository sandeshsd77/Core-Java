package stringHandling;

public class FindIndex {
    public static void main(String[] args) {
        String str = "welcome to it shaala";
        for (int index = 0; index <str.length() ; index++) {
            System.out.print(str.charAt(index)+" ");//print character line by line
        }
        System.out.println();

        System.out.println("Position of character");
        System.out.println(str.indexOf("o")); // index of "o" is 4
        System.out.println(str.lastIndexOf("a")); // lastindex of "a" is 19

        }
    }

