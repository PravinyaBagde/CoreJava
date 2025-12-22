import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = ip.nextInt();

        if (age >= 18) {
            System.out.println("Is Eligible for Voting !");
        } else {
            System.out.println("Not Eligible");
        }
    }
}