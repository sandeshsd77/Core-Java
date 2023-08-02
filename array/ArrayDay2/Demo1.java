package array.ArrayDay2;

public class Demo1 {
    public static void main(String[] args) {
     int [] array = new int [5];
        System.out.println("size of array "+array.length);
        int [] array2 = {1,2,3,4};
        System.out.println("size of array "+array2.length);
        System.out.println("Array of index 2 : "+array2[2]);
        System.out.println("Accesing all the element using for looop ");
        for (int index = 0; index < array2.length; index++) {
            System.out.print(array2[index]+" ");

        }
    }
}
