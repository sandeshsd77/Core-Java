package array.ArrayDay2;

public class MergeArray2 {
    public static void main(String[] args) {
        int [] array1={2,6,8,9};
        int [] array2={1,7,3,5};
        int [] mergeArray = new int[array1.length+ array2.length];
        int mergeArrayIndex=0;
        for (int index = 0; index <array1.length && mergeArrayIndex<mergeArray.length ; index++, mergeArrayIndex++) {
            mergeArray[mergeArrayIndex]=array1[index];
        }
        for (int index = 0; index <array2.length && mergeArrayIndex<mergeArray.length ; index++,mergeArrayIndex++) {
            mergeArray[mergeArrayIndex]=array2[index];
        }
        for (int index = 0; index <mergeArray.length ; index++) {
            System.out.print(mergeArray[index]+" ");

        }

    }

}
