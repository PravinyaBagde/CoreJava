import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = ip.nextLine().trim();

        if (str.isEmpty() || str.isBlank()) {
            System.out.println("Words count: 0");
            return;
        }

        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println("The words present in the string are : " + count);
        ip.close();
    }
}
