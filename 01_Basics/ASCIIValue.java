import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the alphabet - ");
        char ch = ip.next().charAt(0);

        System.out.println("The ASCII Value of " + ch + " is : " + (int)ch);
    }
}