public class BeforeAfter {
    public static void main(String[] args) {
        A();
    }
    static void A(){
        System.out.println("Starts with A");
        B();
        System.out.println("Ends with A");
    }
    static void B(){
        System.out.println("B");
    }
}
