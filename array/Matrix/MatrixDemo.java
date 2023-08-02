package array.Matrix;

import java.util.Scanner;

public class MatrixDemo {
    public static void main(String[] args) {
        int[][] matrix = acceptMatrix();
        printMatrix(matrix);
    }
    public static int[][] acceptMatrix() {
        System.out.println(" Enter the rows & Column");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix1 = new int[rows][columns];
        System.out.println("Enter the Elements");
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[row].length; column++) {
                matrix1[row][column] = scanner.nextInt();
            }
        }
        return matrix1;
    }
    public static void printMatrix(int [][]matrix){
        for (int row = 0; row <matrix.length ; row++) {
            for (int column = 0; column <matrix[row].length ; column++) {
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
}
}