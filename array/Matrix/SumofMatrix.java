package array.Matrix;

import java.util.Scanner;

public class SumofMatrix {
    public static void main(String[] args) {
        System.out.println("Enter the rows and column ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix1 = new int[rows][columns];
        System.out.println("Enter the Elements for matrix1 ");
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[row].length; column++) {
                matrix1[row][column] = scanner.nextInt();
            }
        }
        int[][] matrix2 = new int[rows][columns];
        System.out.println("Enter the Elements for matrix2 ");
        for (int row = 0; row < matrix2.length; row++) {
            for (int column = 0; column < matrix2[row].length; column++) {
                matrix2[row][column] = scanner.nextInt();
            }
        }
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[row].length; column++) {
                System.out.print(matrix1[row][column]+" ");
            }
            System.out.println();
        }
        for (int row = 0; row < matrix2.length; row++) {
            for (int column = 0; column < matrix2[row].length; column++) {
                System.out.print(matrix2[row][column]+" ");
            }
            System.out.println();
        }
        int [][] matrix3 = new int[rows][columns];
        for (int row = 0; row < matrix3.length; row++) {
            for (int column = 0; column < matrix3[row].length; column++) {
                matrix3[row][column] = matrix1[row][column]+matrix2[row][column];
            }
        }
        System.out.println("Sum of two matrix");
        for (int row = 0; row < matrix3.length; row++) {
            for (int column = 0; column < matrix3[row].length; column++) {
                System.out.print( matrix3[row][column]+" ");
            }
            System.out.println();
        }
    }
}