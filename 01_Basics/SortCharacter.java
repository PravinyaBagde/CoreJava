import java.util.Arrays;
import java.util.Scanner;

public class SortCharacter {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the String - ");
        String str = ip.nextLine().toLowerCase();

        // Step 1: Convert String to char array
        char[] chars = str.toCharArray();
        // Step 2: Sort the char array
        Arrays.sort(chars);
        // Step 3: Convert sorted char array back to String
        String sortedString = new String (chars);

        System.out.println("Original String is : " + str);
        System.out.println("Duplicate String is : " + sortedString);
    ip.close();
    }
}
