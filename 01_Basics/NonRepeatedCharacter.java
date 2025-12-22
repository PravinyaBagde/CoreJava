public class NonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "but a mumma is IN LOVE WITH a criminal";

        String newStr = str.toLowerCase().replace(" ", "");

        for (int i = 0; i < newStr.length(); i++) {
            char ch = newStr.charAt(i);
            int count = 0;

            for (int j = 0; j < newStr.length(); j++) {
                if (newStr.charAt(j) == ch) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("The first non-repeated character is: " + ch);
                break;
            }
        }
    }
}