import java.util.Scanner;

public class FactorialofNumber {
        public static void main(String[] args) {
            Scanner ip = new Scanner(System.in);
            System.out.print("Enter the Number : ");
            int n = ip.nextInt();

            long sum = 1;
            for (int i = 1; i <= n; i++) {
                sum = sum * i;
                System.out.println(sum);
            }
            System.out.println("Factorial is : " + sum);
            ip.close();
        }
    }
