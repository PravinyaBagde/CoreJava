public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;

        int prev = 0;
        int next = 1;

        System.out.println("Fibonacci Series is : ");

        for (int i = 1; i <= n; i++) {
            System.out.print(prev + " , ");
            int present = prev + next;

            prev = next;
            next = present;
        }
    }
            }
