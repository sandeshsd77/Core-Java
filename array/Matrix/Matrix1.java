package array.Matrix;

public class Matrix1 {
    public static void main(String[] args) {
        int[][] array = {
                {10, 20, 30},
                {40, 50, 60, 70},
                {80,90,100,110}
            };
        for (int index = 0; index <array.length ; index++) {
            for (int j = 0; j <array[index].length ; j++) {
                System.out.print(array[index][j]+" ");
            }
            System.out.println();
        }
    }
}