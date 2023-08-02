package array.ArrayDay2;

public class CopyContent2 {
    public static void main(String[] args) {
        int [] oldArray = {2,4,6,8};
        int[] newArray = new int[oldArray.length];
        for (int index = 0; index < oldArray.length ; index++) {
            newArray[index]=oldArray[index];
        }
        System.out.println("Copy content of New Array ");
        for (int index = 0; index < newArray.length ; index++) {
            System.out.print(newArray[index]+" ");

        }
    }
}
