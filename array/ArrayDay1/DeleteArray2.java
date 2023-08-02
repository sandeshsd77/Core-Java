package array.ArrayDay1;

public class DeleteArray2 {
    public static void main(String[] args) {
        int [] oldarray = {1,2,3,4};
        int deleteIndex = 2;
        int deleteNumber = deleteIndex;
        int [] newArray = new int[oldarray.length-1];
        for (int index = 0; index <deleteIndex ; index++) {
            newArray[index]=oldarray[index];
        }
        for (int index = deleteIndex+1; index < oldarray.length ; index++) {
            newArray[index-1]=oldarray[index];
        }
        oldarray=newArray;
        for (int index = 0; index < oldarray.length ; index++) {
            System.out.print(oldarray[index]+" ");
        }
    }
}
