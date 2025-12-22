import java.util.Scanner;

public class VowelORConsonant {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter the alphabet - ");
        char ch = ip.next().toLowerCase().charAt(0);


        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("It's a Vowel");
        } else {
            System.out.println("It's a Consonant");
        }
        ip.close();
    }
}