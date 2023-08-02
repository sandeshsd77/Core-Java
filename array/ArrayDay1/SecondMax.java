package array.ArrayDay1;

public class SecondMax {
    public static void main(String[] args) {
        int[] array = {10, 65, 78, 60, 55, 50};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int index = 0; index < array.length; index++) {
            if (array[index] > max) {
                secondMax = max;
                max = array[index];
            }
            if (array[index] < max && array[index] > secondMax) {
                secondMax = array[index];
            }
        }
        System.out.println("Maximum NUmber= " + max);
        System.out.println("Secondmax Number= " + secondMax);
    }
}
