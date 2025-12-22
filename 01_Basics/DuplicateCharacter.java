import java.util.Scanner;

public class DuplicateCharacter {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter the String - ");
        String str = ip.nextLine().toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //Skip Spaces
            if (ch == ' ') {
                continue;
            }
            //Check if character appears again
            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    System.out.println("Duplicate Character is  : " + ch);
                    break;
                }
            }
            ip.close();
        }
    }
        }