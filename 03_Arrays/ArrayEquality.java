public class ArrayEquality {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {71, 6, 1, 8};

        arrayEquality(arr1, arr2);
    }

    static void arrayEquality(int[] arr1, int[] arr2) {
        // Step 1: Check length
        if (arr1.length != arr2.length) {
            System.out.println("Arrays are NOT Equal");
            return;
        }
        // Step 2: Compare elements at same index
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println("Arrays are NOT Equal");
                return;
            }
        }

        // Step 3: If all elements matched
        System.out.println("Arrays are Equal");
    }
}
