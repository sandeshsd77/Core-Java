package stringHandling;

public class ReverseStringWords {
    public static void main(String[] args) {
        String str = " Hello Sandesh Good Morning";
        String [] array = str.split(" ") ;
        int left = 0;
        int right = array.length-1;
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
