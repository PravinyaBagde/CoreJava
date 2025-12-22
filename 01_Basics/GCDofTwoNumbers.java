public class GCDofTwoNumbers {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;

        while (num2!=0){
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        System.out.println("GCD is : " + num1);
    }
}
