package array.ArrayDay2.ReverseArray;

public class ReverseString {
    public static void main(String[] args) {
        String str = " Hello Sandesh";
        char[] array = str.toCharArray() ;
        int left =0;
        int right= array.length-1;
        while (left<right){
            char temp = array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;
        }
        for (int index = 0; index < array.length ; index++){
            System.out.println(array[index]+" ");
        }
    }
}
