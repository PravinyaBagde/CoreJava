public class TwiceMethod {
    public static void main(String[] args) {
        test();
    }
    static void test(){
        show();
        show();
    }
    static void show(){
        System.out.println("Show");
    }
}
