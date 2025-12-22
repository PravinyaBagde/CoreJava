import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter the String - ");
        String str = ip.nextLine().toLowerCase();

        String newStr = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            newStr = newStr + str.charAt(i);
        }
        System.out.println("Reverse is : " + newStr);
    }
}
