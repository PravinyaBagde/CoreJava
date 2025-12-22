import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Step 1: Normalize strings
        str1 = str1.toLowerCase().replace(" ", "");
        str2 = str2.toLowerCase().replace(" ", "");

        //Step 2 : Length Check
        if(str1.length() != str2.length()){
            System.out.println("Not a Anagram String !!!");
            return;
        }
        // Step 3: Convert to char arrays
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        // Step 4: Sort both arrays
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        // Step 5: Compare sorted arrays
        if(Arrays.equals(chars1, chars2)){
            System.out.println("Anagram String ✅");
        } else {
            System.out.println("Not an Anagram String ❌");
        }
    }
}