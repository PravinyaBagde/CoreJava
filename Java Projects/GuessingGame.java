import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int number = 1 + (int) (100 * Math.random());

        //Number of Attempts
        int k = 5;
        System.out.println("A Number Must be Chosen Between 0 to 100");
        System.out.println("You have " + k + " attempts to guess !");

        //Loop for k attempts

        for (int i = 0; i < k; i++) {
            System.out.print("Enter You Guess - ");
            int guess = ip.nextInt();

            //Check Conditions
            if (guess == number) {
                System.out.println("Congratulations! You guessed the correct number.");
                ip.close();
                return;
            } else if (guess < number) {
                System.out.println("The Number is Greater than " + guess);
            } else {
                System.out.println("The Number is Smaller than " + guess);
            }
        }
        //Attempst Over
        System.out.println("You have Exhausted All Attempts !!!");
        System.out.println("The Correct Number Was : " + number);
        ip.close();
    }
}
