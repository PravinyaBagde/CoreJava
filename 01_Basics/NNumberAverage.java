import java.util.Scanner;

public class NNumberAverage {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("How Many Numbers You Will be Entering ? ");
        int Number = ip.nextInt();

        double Sum = 0;

        for (int i = 1; i <= Number ; i++) {
            System.out.println("Enter the Numbers - " + i);
            double Value = ip.nextInt();
            Sum = Sum + Value;
        }
        double Average = Sum / Number;
        System.out.println("The Average is : " + Average);
    }
}
