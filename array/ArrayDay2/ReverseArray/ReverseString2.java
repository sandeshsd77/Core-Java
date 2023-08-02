package array.ArrayDay2.ReverseArray;

public class ReverseString2 {
    public static void main(String[] args) {
        String str = "Hey am Sandesh ";
        char [] array = str.toCharArray(); // for reversing whole string (output :  h s e d n a S   m a   y e H )
//        String [] array = str.split(" "); // for reversing word string (output : Sandesh am Hey)
        int left=0;
        int right= array.length-1;
        while (left<right){
            char temp=array[left]; // for reversing whole string (output :  h s e d n a S   m a   y e H )
//            String temp=array[left]; // for reversing word string (output : Sandesh am Hey)
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
