import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        double principal = ip.nextDouble();

        System.out.println("Enter the rate of interest:");
        double rate = ip.nextDouble();

        System.out.println("Enter the time period (in years):");
        double time = ip.nextDouble();

        // Compound Interest formula
        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest is : " + compoundInterest);
        System.out.println("Total Amount is : " + amount);
    }
}
