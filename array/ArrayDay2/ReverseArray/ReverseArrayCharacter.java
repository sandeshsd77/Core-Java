package array.ArrayDay2.ReverseArray;

public class ReverseArrayCharacter {
    public static void main(String[] args) {
        char[] array = {'A','B','C','D'};
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
