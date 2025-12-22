public class Remainder {
    public static void main(String[] args) {
        int dividend = 19 ;
        int divisor = 8;

        int answer = dividend - (dividend / divisor) * divisor;
        System.out.println("The Remainder without Using % is : " + answer);
    }
}
