package array.ArrayDay1;

public class OddNumber {
    public static void main(String[] args) {
        int [] array = {11,20,25,15,7,10};

        for (int index = 0; index < array.length; index++) {
          if (array[index]%2!=0){
              System.out.println(array[index]);
          }
        }
    }
 }
