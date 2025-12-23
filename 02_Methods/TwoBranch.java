public class TwoBranch {
    public static void main(String[] args) {
        A();
    }
    static void X() {
        System.out.println("X");
    }

    static void Y() {
        System.out.println("Y");
    }

    static void A() {
        X();
        Y();
    }
}
