import java.util.Scanner;

public class NumberRev {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = ip.nextInt();

        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reversed Number = " + rev);
        ip.close();
    }
}