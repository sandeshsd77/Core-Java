package array.ArrayDay1;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArray {
    public static void main(String[] args) {
        int [] array1 = new int[5];
        int [] array2 = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Elements for array1");
        for (int index = 0; index <array1.length ; index++) {
            array1[index] = scanner.nextInt();
        }
        System.out.println("Enter the Elements for array2");
         for (int index = 0; index <array2.length ; index++) {
            array2[index]= scanner.nextInt();
        }
        boolean b= Arrays.equals(array1,array2);
        System.out.println(" Both are Equals : "+b);
    }
}
