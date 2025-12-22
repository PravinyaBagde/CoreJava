import java.util.Scanner;

public class AlphabetorDigit {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the Word - ");
        char ch = ip.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
            System.out.println("It's an alphabet");
        }else if (ch >= '0' && ch <= '9'){
            System.out.println("It's a digit");
        }else{
            System.out.println("Its's a Special Character !!!");
        }
    }
}
