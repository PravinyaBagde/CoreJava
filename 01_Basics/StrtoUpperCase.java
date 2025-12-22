import java.util.Scanner;

public class StrtoUpperCase {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter your string - ");
        String str = ip.nextLine().toLowerCase();

        String newStr = str.toUpperCase();
        System.out.print("UpperCase String is : " + newStr);

        ip.close();
    }

}
