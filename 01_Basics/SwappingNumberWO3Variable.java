public class SwappingNumberWO3Variable {
    public static void main(String[] args) {
        int x = 2;
        int y = 4;

        x = x+y;
        y = x-y;
        x=x-y;
        System.out.println("After swapping x is : " + x);
        System.out.println("After swapping y is : " + y);
    }
}
