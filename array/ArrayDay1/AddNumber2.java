package array.ArrayDay1;

public class AddNumber2 {
    public static void main(String[] args) {
        int [] oldArray = {1,2,3,5,6};
        int insertIndex = 3;
        int insertNumber=4;
        int [] newArray = new int[oldArray.length+1];
        for (int index = 0; index < insertIndex ; index++){
            newArray[index] = oldArray[index];
        }
        newArray[insertIndex]=insertNumber;
        for (int index = insertIndex; index < oldArray.length ; index++) {
            newArray[index+1]=oldArray[index];
        }
            oldArray=newArray;
        for (int index = 0; index < oldArray.length ; index++) {
            System.out.print(oldArray[index]+" ");

//            for (int i : oldArray) {
//                System.out.print(i + " ");
        }
    }
}
