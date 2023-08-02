package array.ArrayDay2.charArray;

public class CharArrayDemo1 {
    public static void main(String[] args) {
        char [] array = {'A','B','C','D'};
        for (int index = 0; index < array.length; index++) {
//            System.out.println(array[index]);
        }
        for (char ch:array
             ) {
            System.out.print(ch+ " ");
        }
    }
}
