public class PalindromeString {
    public static void main(String[] args) {
        String str = "car";
        String Rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            Rev = Rev + str.charAt(i);
        }
        if (str.equals(Rev)){
            System.out.println("Is Palindrome");
        }else {
            System.out.println("Not a Palindrome");
        }
    }

}
