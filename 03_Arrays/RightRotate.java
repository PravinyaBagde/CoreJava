import java.util.Scanner;

public class RightRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of rotations - ");
        int k = ip.nextInt();

        rightRotate(arr, k);

        System.out.println("After Right Rotations Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        ip.close();
    }
    static void reverse(int[]arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rightRotate(int[]arr, int k){
        int n = arr.length;
        k = k % n;

        // Step 1: Reverse whole array
        reverse(arr, 0 , n-1);

        //Step 2: Reversing the first k elements
        reverse(arr, 0, k-1);

        // Step 3: Reverse remaining n-k elements
        reverse(arr, k, n - 1);
    }
}




    //Right Rotation: 👉 1) reverse all → 2) reverse first k → 3) reverse rest