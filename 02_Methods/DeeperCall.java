public class DeeperCall {
    public static void main(String[] args) {
        A();
    }

    static void D() {
        System.out.println("D");
    }

    static void C() {
        D();
        System.out.println("C");
    }

    static void B() {
        C();
        System.out.println("B");
    }

    static void A() {
        B();
        System.out.println("A");
    }
}
