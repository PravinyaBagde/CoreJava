import java.util.Scanner;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of rotation - ");
        int k = ip.nextInt();

        leftRotate(arr, k);

        System.out.print("After Left Rotations Array is : ");
        for (int num = 0; num < arr.length; num++) {
            System.out.print(arr[num] + " ");
        }

        ip.close();
    }
    static void reverse (int[]arr, int start , int end){
    while (start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
    }
    static void leftRotate(int[]arr, int k){
        int n = arr.length;

        k = k % n ;

        //Step 1 : Reverse the first k element
        reverse(arr, 0, k-1);

        //Step 2 : Reverse the remaining n-k element
        reverse(arr, k , n-1);

        //Step 3: Reverse whole array
        reverse(arr, 0 , n-1);
    }
}

  //  Left Rotation: 👉 1) reverse first k → 2) reverse rest → 3) reverse all