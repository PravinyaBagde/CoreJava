public class ChainMethod {
    public static void main(String[] args) {
        C();
        A();
    }
    static void A(){
        System.out.println("A");
    }
    static void B(){
        A();
        System.out.println("B");
    }
    static void C(){
        B();
        System.out.println("C");
    }
}
