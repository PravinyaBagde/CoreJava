import java.util.Scanner;

public class LengthofString2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter the String - ");
        String str = ip.nextLine().toLowerCase();



        if(str.isEmpty() || str.isBlank()){
            System.out.println("String is EMPTY and BLANK !!!");
            return;
        }
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        System.out.println("The count is : " + count);
        ip.close();
    }

}
