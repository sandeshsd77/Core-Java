package array.ArrayDay2;

public class SwapArray {
    public static void main(String[] args) {
        int[] array = {2, 5, 7, 6, 8, 9}; // Output : 8 6 7 5 2
        int temp = 0;
//        System.out.println(array.length);//6
        int lastIndex = array.length - 1;//6-1 = 5
        for (int index = 0; index < array.length / 2; index++) {
            temp = array[index];
            array[index] = array[lastIndex];
            array[lastIndex] = temp;
            lastIndex--;
        }
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }
}



