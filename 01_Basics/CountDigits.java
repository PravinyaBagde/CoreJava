public class CountDigits {
    public static void main(String[] args) {
        int number = 698976;

        int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        System.out.println("Counts of digits is : " + count);
    }
}