import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the string - ");
        String str = ip.nextLine();

        String result = str.replace(" ", "");
        System.out.println("The String After Space Removed is : " + result);

        ip.close();
    }
}
