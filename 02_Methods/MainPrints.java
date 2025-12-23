public class MainPrints {
    public static void main(String[] args) {
        System.out.println("Start");
        B();
        System.out.println("End");
    }
    static void A() {
        System.out.println("A");
    }

    static void B() {
        A();
        System.out.println("B");
    }
}
