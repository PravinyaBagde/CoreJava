import java.util.Scanner;

public class StrtoLowerCase {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter your string - ");
        String str = ip.nextLine().toUpperCase();

        String newStr = str.toLowerCase();
        System.out.print("UpperCase String is : " + newStr);

        ip.close();
    }

}


