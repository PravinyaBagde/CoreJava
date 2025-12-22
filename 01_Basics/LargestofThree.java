import java.util.Scanner;
public class LargestofThree {
        public static void main(String[] args) {
            Scanner ip = new Scanner(System.in);
            System.out.println("Enter the first Number : ");
            int x = ip.nextInt();

            System.out.println("Enter the second Number : ");
            int y = ip.nextInt();

            System.out.println("Enter the third Number : ");
            int z = ip.nextInt();
            if (x >= y && x >= z) {
                System.out.println(x + " is the largest.");
            } else if (y >= x && y >= z){
                System.out.println(y + " is the largest.");
            }else {
                System.out.println(z + " is the largest.");
            }
        }
    }