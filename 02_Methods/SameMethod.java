public class SameMethod {
    public static void main(String[] args) {
        B();
    }
    static void A() {
        System.out.println("A");
    }

    static void B() {
        A();
        System.out.println("B");
        A();
    }
    }

