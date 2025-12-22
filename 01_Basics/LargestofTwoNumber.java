import java.util.Scanner;
public class LargestofTwoNumber {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter the first Number : ");
        int x = ip.nextInt();

        System.out.println("Enter the second Number : ");
        int y = ip.nextInt();

        if(x > y){
            System.out.println(x + " is the largest.");
        }else if (x < y){
            System.out.println(y + " is the largest.");
        }else {
            System.out.println("Numbers are equal !!!");
        }
    }
}
