public class InvertedStarTriangle {
    public static void main(String[] args) {

        int n = 5;

        for (int i = n; i >= 1; i--) {      // rows
            for (int j = 1; j <= i; j++) {  // stars
                System.out.print("*");
            }
            System.out.println();           // new line
        }
    }
}

