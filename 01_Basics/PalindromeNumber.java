import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = ip.nextInt();

        int Original = number;
        int rev = 0;

        while (number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;
        }
        if (Original == rev) {
            System.out.println("Is a Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
        ip.close();
    }
}