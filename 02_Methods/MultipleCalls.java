public class MultipleCalls {
    public static void main(String[] args) {
        mainMethod();
    }
    static void mainMethod(){
        X();
        Y();
    }
    static void X(){
        System.out.println("X");
    }
    static void Y(){
        System.out.println("Y");
    }
}
