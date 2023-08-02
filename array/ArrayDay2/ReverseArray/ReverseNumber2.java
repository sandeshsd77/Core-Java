package array.ArrayDay2.ReverseArray;

public class ReverseNumber2 {
    public static void main(String[] args) {
        int [] array = {1,3,5,7,9};
        int left=0;
        int right= array.length-1;
        while(left<right){
            int temp=array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;
        }
        for (int index = 0; index < array.length ; index++) {
            System.out.print(array[index]+" ");
        }
    }
}
