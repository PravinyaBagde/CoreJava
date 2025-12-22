import java.util.Scanner;

public class SumofNNaturalNumbers {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = ip.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
        System.out.println("Sum is : " + sum);
        ip.close();
    }
}