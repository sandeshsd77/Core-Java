package array.ArrayDay2;
//sum of two numbers
public class SumOfTwoArray {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {6,7,8,9,10};
        for (int index = 0; index < array1.length; index++){
            array1[index]=array1[index]+array2[index];
        }
        for (int index = 0; index < array1.length ; index++) {
            System.out.print(array1[index]+" ");

        }
    }

}
