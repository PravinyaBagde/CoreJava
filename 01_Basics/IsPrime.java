import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = ip.nextInt();

        if (n <= 1) {
            System.out.println("Not a Positive Intger");
            return;
        }
    boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if(n % 2 == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("Is a Prime NUmber");
        }else {
            System.out.println("Not a prime Number");
        }
    }
}

