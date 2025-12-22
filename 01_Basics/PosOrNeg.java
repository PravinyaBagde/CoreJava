import java.util.Scanner;
public class PosOrNeg {
    public static void main(String[] args) {
       Scanner ip = new Scanner(System.in);
       System.out.println("Enter the number - ");
       int number = ip.nextInt();

        if(number < 0){
            System.out.println("Is a Negative Number");
        }else {
            System.out.println("Is a Positive Number");
        }
    }
}
