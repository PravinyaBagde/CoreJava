public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = matrix.length;

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < n; i++) {
            primaryDiagonal = primaryDiagonal + matrix[i][i];
            secondaryDiagonal = secondaryDiagonal + matrix[i][n-1-i];
        }
        System.out.println("Primary Diagonal Sum: " + primaryDiagonal);
        System.out.println("Secondary Diagonal Sum: " + secondaryDiagonal);
    }
}