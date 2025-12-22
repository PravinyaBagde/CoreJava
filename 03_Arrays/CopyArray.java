import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {45, 12, 75, 89, 95, 56};
        System.out.println("The original array is : " + Arrays.toString(arr));

        int[] newArray = Arrays.copyOf(arr, arr.length);
        System.out.println("The Copy Array is : " + Arrays.toString(newArray));
    }
}
