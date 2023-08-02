package array.ArrayDay1;

public class SecondMinimum {
    public static void main(String[] args) {
        int [] array = {10,11,35,65,98,9,12,5};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int index = 0; index < array.length ; index++) {
            if (array[index] < min) {
                secondMin = min;
                min = array[index];
            }
            if (array[index] > min && array[index] < secondMin) {
                secondMin = array[index];
            }
        }
        System.out.println("Minimum : "+min);
        System.out.println("Secondminimum : "+secondMin);
    }
}
