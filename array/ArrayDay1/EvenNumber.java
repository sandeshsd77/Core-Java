package array.ArrayDay1;

public class EvenNumber {
    public static void main(String[] args) {
        int[] array = {25, 15, 78, 36, 40};
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 0) {
                System.out.println("OddNumber= " + array[index]);
            }

        }
    }
}
