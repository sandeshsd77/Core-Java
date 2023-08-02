package array.ArrayDay1;

public class MaxNumber {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int max = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] > max) {
                max = array[index];
            }
        }
                System.out.println(max);
    }
}
