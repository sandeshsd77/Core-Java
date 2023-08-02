package array.ArrayDay1;

import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = scanner.nextInt();
        int[] array = new int[size];//3
        System.out.println("Enter the Element of Array");
        for (int index = 0; index < array.length; index++) {
            array[index] = scanner.nextInt();//1 2 3
        }
        System.out.println("Enter array location : ");
        int loc = scanner.nextInt();//1
        for (int index = loc; index < size-1; index++) {
            array[index]=array[index+1];
        }
        size--;
        for (int index = 0; index <size ; index++) {
            System.out.println(array[index]+" "); // 1 2
        }
    }
}
