package array.ArrayDay2;

public class Demo2EvenNumber {
    public static void main(String[] args) {
        int [] array = {12,10,25,44,5};
        for (int index = 0; index < array.length ; index++) {
            if(array[index]%2==0){
                System.out.println("Even Number " + array[index]);
            }

        }
    }
}
