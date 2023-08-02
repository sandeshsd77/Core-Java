package array.ArrayDay1;

public class CopyArray {
    public static void main(String[] args) {
        int [] oldArray = {2,5,7,2,3};
        int [] newArray = new int[oldArray.length];
        for (int index = 0; index <oldArray.length ; index++) {
            newArray[index]=oldArray[index];
        }
        for (int index = 0; index < newArray.length; index++) {
        System.out.print(newArray[index]+" ");
        }
    }
}


