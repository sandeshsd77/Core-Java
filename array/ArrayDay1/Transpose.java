package array.ArrayDay1;

import java.util.Scanner;

public class Transpose {
    public static void main(String [] args){
        int[][] array = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array Data");
        for (int i = 0 ; i<= 1 ; i++){
            for (int j =0 ; j<= 1 ; j++){
                array [i][j] = scanner.nextInt();
            }
        }

//        System.out.print("Array Matrix: ");
        for(int i =0 ; i<= 1 ; i++){
            for (int j =0 ; j<= 1 ; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.print("\n");
        }
        for(int i =0 ; i<= 1 ; i++){
            for (int j =0 ; j<= 1 ; j++){
                System.out.print(array[j][i]+" ");
            }
            System.out.print("\n");
        }
    }
}
