package array.ArrayDay2.charArray;

public class CharLinearSearchArray {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D', 'R'};
        char key = 'D';
        for (int index = 0; index < chars.length; index++) {
            if (chars[index] == key) {
                System.out.println("Char is present " + chars[index]+ " at index "+index);
                break;
            }
        }
    }
}