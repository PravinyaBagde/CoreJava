public class LCMofTwoNumber {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 8;

        int a = num1;
        int b = num2;

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        int GCD = a;
        long Answer = (num1 * num2) / GCD;
        System.out.println("LCM of " + num1 + " and " + num2 +" is : " + Answer);
    }
}
