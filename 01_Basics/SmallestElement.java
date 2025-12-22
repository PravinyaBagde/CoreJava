public class SmallestElement {
    public static void main(String[] args) {
    int[] arr = {12, 34, 89, 92, 45, 18, 7};
    int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
            System.out.println("The Smallest Element is : " + min);
}
    }

