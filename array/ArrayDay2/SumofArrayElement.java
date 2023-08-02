package array.ArrayDay2;

public class SumofArrayElement {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        int sum=0;
        for (int index = 0; index < array.length ; index++) {
            sum+=array[index];
        }
        System.out.println("Sum of the array element "+sum);
    }
}
