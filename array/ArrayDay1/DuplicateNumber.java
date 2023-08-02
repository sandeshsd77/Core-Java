package array.ArrayDay1;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] array = {1,1,2,5,5,6};
//        int [] temp=new int[array.length];
        int j=0;
        for (int index = 0; index < array.length-1; index++) {
            if (array[index] != array[index + 1]) {
             array[j] = array[index];
                j++;
            }
        }
           array[j]=array[array.length-1];
        for (int i = 0; i <j+1 ; i++) {
            System.out.println(array[i]+" ");
        }
    }
}
