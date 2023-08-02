package array.Matrix;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                transpose[column][row] = matrix[row][column];
            }
        }
        System.out.println(" Transpose Matrix : ");
        for (int row = 0; row < transpose.length; row++) {
            for (int column = 0; column < transpose[row].length; column++) {
                System.out.print(transpose[row][column] + " ");
            }
            System.out.println();

        }
    }
}
