package array.ArrayDay2;

public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        int[] mergeArray = new int[array1.length + array2.length];
        int indexMergeArray = 0;
        for (int index = 0; index < array1.length && indexMergeArray<mergeArray.length; index++, indexMergeArray++) {
            mergeArray[indexMergeArray] = array1[index];
        }
        for (int index = 0; index < array2.length && indexMergeArray<mergeArray.length; index++, indexMergeArray++) {
            mergeArray[indexMergeArray] = array2[index];
        }
        for (int index = 0; index <mergeArray.length ; index++) {
        System.out.print(mergeArray[index]+" ");
        }
    }
}
