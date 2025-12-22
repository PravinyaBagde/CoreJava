public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 34, 89, 92, 45, 18, 7};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Largest Element : " + max);
        System.out.println("Second Largest Element : " + secondMax);
    }
}
