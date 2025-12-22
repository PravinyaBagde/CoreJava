public class SwapNumbers {
    public static void main(String[] args) {
        int x =2;
        int y =4;

        int z = y;
        y = x;
        x = z;
        System.out.println("Value of x after swapping is : " + x);
        System.out.println("Value of y after swapping is : " + y);
    }
}
