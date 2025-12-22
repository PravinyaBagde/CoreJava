import java.util.Scanner;

public class FactorialRecursion {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0) { // base case
            return 1;
        } else {
            return n * factorial(n - 1); // recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = factorial(num);

        System.out.println("Factorial of " + num + " is: " + result);

        sc.close();
    }
}
