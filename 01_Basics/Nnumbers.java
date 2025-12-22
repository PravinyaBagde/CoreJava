import java.util.Scanner;

public class Nnumbers {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = ip.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println(i);
        }
    }
}
