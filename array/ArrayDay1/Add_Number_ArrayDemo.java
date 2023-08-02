package array.ArrayDay1;

public class Add_Number_ArrayDemo {
    public static void main(String[] args) {
        int[] oldarray = {1, 2, 3, 6, 7};
        int insertIndex = 2;
        int valuetoInsert = 5;
        int[] newArray = new int[oldarray.length + 1];
        for (int index = 0; index < insertIndex; index++) {
            newArray[index] = oldarray[index];
        }
        newArray[insertIndex] = valuetoInsert;
        for (int index = insertIndex; index < oldarray.length; index++) {
            newArray[index + 1] = oldarray[index];
        }
        oldarray = newArray;
        for (int index = 0; index < oldarray.length; index++) {
            System.out.print(newArray[index] + " ");

        }
    }
}