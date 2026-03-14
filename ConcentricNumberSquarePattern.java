public class ConcentricNumberSquarePattern {
    public static void main(String[] args) {
        printConcentricNumberSquarePattern(4);
    }

    private static void printConcentricNumberSquarePattern(int n) {

        int size = 2*n-1;

        for(int row = 1; row <= size; row++) {
            for(int col = 1; col <=size; col++) {
                int value = n;

                if(row < value)
                    value = row;

                if(col < value)
                    value = col;

                if(size - row + 1 < value)
                    value = size -row + 1;

                if(size - col + 1 < value)
                    value = size - col +1;

                System.out.print(n-value+1 + " ");
            }
            System.out.println();
        }
    }
}
