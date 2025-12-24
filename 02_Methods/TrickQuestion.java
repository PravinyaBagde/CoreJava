public class TrickQuestion {
    public static void main(String[] args) {
        System.out.println("Start");
        C();
        B();
        System.out.println("End");
    }
    static void A() {
        System.out.println("A");
    }

    static void B() {
        System.out.println("B1");
        A();
        System.out.println("B2");
    }

    static void C() {
        System.out.println("C1");
        B();
        A();
        System.out.println("C2");
    }
}
