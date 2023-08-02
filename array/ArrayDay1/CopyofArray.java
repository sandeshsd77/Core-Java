package array.ArrayDay1;

import java.util.Arrays;
import java.util.Scanner;

public class CopyofArray {
    public static void main(String[] args) {
        int [] array1= new int[5];
        System.out.println("Enter Elements of Array1");
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < array1.length ; index++) {
            array1[index]= scanner.nextInt();
        }
        int[] array2= Arrays.copyOf(array1,5);
        for (int index = 0; index <array2.length; index++) {
            System.out.println("Elements of Array2 : "+array2[index]);
      }
    }
}
