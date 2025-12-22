import java.util.Scanner;

public class OddNNumbers {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = ip.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            ip.close();
        }
    }
}
