package array.ArrayDay1;

public class MinNumber {
    public static void main(String[] args) {
        int [] array = {25,85,67,19,24,6874,15,24,31};
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < min) {
                min=array[index];
            }
        }
        System.out.println(min);
    }
}
