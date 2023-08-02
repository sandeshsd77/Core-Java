package array.ArrayDay1;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Data in Array ");
        for (int index = 0; index < array.length; index++) {
            array[index] = scanner.nextInt();
        }
        Arrays.sort(array);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
