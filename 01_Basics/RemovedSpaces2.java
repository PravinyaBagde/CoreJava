import java.util.Scanner;

public class RemovedSpaces2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the string - ");
        String str = ip.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                result = result + ch;
            }
        }
        System.out.println("After Removing Spaced : " + result);
    }
}
