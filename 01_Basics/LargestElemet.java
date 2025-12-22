import java.util.Arrays;

public class LargestElemet {
    public static void main(String[] args) {
        int[] arr = {12, 34, 89, 92, 45, 18, 7};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
            System.out.println("The Largest Element is : " + max);
        }
    }
