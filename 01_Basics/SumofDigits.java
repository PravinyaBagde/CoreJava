import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = ip.nextInt();

        long answer = 0;

    while (number != 0) {
        int digit = number % 10;
        answer = answer + digit;
        number = number / 10;
    }
        System.out.println("Sum of digits of a number is : " + answer);
        ip.close();
    }
}

