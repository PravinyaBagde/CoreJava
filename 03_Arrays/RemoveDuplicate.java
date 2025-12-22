import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {12, 45, 12, 75, 89, 95, 56};
        int[] uniqueArray = Arrays.stream(arr).distinct().toArray();

        Arrays.sort(uniqueArray);
        System.out.println("Array is : " + Arrays.toString(uniqueArray));
    }
}