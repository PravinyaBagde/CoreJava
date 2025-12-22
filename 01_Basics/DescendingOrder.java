import java.util.Arrays;

public class DescendingOrder {
        public static void main(String[] args) {
            int[] arr = {12, 34, 89, 92, 45, 18, 7};

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.println("Descending Order Array is : " + Arrays.toString(arr));
        }
    }
