import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the string - ");
        String str = ip.nextLine().toLowerCase();

        String newStr = str.replace("a", "u");
        System.out.println("After Replacement the String is  : " + newStr);
    ip.close();
    }
}


