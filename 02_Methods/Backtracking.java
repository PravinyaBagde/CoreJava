public class Backtracking {
    public static void main(String[] args) {
        A();
        System.out.println("Inside Main");
    }
    static void A(){
        B();
        System.out.println("Inside A");
    }
    static void B(){
        C();
        System.out.println("Inside B");
    }
    static void C(){
        System.out.println("Inside C");
    }
}
