public class SimpleNestedCalls {
    public static void main(String[] args) {
        A();
    }
    static void C(){
        System.out.println("C");
    }
    static void B(){
        C();
        System.out.println("B");
    }
    static void A(){
        B();
        System.out.println("A");
    }
}
