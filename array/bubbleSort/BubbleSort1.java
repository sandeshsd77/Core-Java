package array.bubbleSort;

public class BubbleSort1 {
    public static void main(String[] args) {
        int array[] = {5, 3, 2, 9, 1, 8};
        int temp;
        for (int i = 0; i < array.length; i++) {
            //array.lenth-1 becoz we are shifting the highest element toward the rightside
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // we are using the temporary variable 'temp' to store value
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Number ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+" ");
        }
    }
}
