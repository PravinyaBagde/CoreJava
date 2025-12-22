import java.util.Arrays;

public class SumofArrayElement {
    public static void main(String[] args) {
        int[]arr = {12, 34, 89, 92, 45, 18, 7};
        Arrays.sort(arr);

        double sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of array elements is : " + sum);
    }
}
