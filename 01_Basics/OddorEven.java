public class OddorEven {
    public static void main(String[] args) {
        int x = 911;
        if(x < 0){
            System.out.println("Not a Positive Integer");
        }else if (x % 2 == 0){
            System.out.println("Is an Even Number");
        }else{
            System.out.println("Is an Odd Number");
        }
    }
}
