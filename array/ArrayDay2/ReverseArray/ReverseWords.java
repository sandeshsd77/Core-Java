package array.ArrayDay2.ReverseArray;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello Sandesh";
        String[] array = str.split(" ") ;
        int left =0;
        int right= array.length-1;
        while (left<right){
            String temp = array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;
        }
        for (int index = 0; index < array.length ; index++){
            System.out.print(array[index]+" ");
        }
    }
}
