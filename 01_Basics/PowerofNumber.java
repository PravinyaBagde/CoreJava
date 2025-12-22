import java.util.Scanner;

public class PowerofNumber {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int number = ip.nextInt();

        System.out.println("Enter the Exponent : ");
        int exponent = ip.nextInt();

        int answer = 1;
        while (exponent > 0){
            answer = answer * number;
            exponent--;
        }
        System.out.println("The answer is : " + answer);
    }
}
