public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};

        int[] mergeArray = new int[arr1.length + arr2.length];

        int index = 0;

        //Step 1: Copying all the elements from arr1
        for (int i = 0; i < arr1.length; i++) {
            mergeArray[index] = arr1[i];
            index++;
        }
        //Step 2: Copying all the elements from arr2
        for (int i = 0; i < arr2.length; i++) {
            mergeArray[index] = arr2[i];
            index++;
        }
        //Step 4 : Print Merged Array

        for (int i = 0; i < mergeArray.length; i++) {
            System.out.print(mergeArray[i] + " ");
        }
    }
}
