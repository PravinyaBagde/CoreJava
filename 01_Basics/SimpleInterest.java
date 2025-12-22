import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter the borrowed amount - ");
        int amount = ip.nextInt();

        System.out.println("Enter the rate of interest - ");
        int interest = ip.nextInt();
        float ROI = interest;

        System.out.println("Enter the time period - ");
        int year = ip.nextInt();

        float SI = (amount * ROI * year) / 100;
        System.out.println("The Simple interest for " + year +" years is : " + SI);
    }
}
