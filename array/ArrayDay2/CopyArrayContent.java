package array.ArrayDay2;

public class CopyArrayContent {
    public static void main(String[] args) {
        int[] oldArray = {1,2,3,4};
        int [] newArray = new int[oldArray.length];
        for (int index = 0; index < oldArray.length ; index++) {
            newArray[index]=oldArray[index];
        }
        System.out.println("Printing the Content of new Array ");
        for (int index = 0; index <newArray.length ; index++) {
            System.out.print(newArray[index]+" ");
        }
    }

}
