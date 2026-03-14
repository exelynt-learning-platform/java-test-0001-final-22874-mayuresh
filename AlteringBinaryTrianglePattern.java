public class AlteringBinaryTrianglePattern {
    public static void main(String[] args) {
        printAlteringBinaryTrianglePattern(6);
    }

    private static void printAlteringBinaryTrianglePattern(int n) {

        for(int row=1; row <= n; row++) {
            int number = row % 2;

            for(int col = 1; col <= row; col++) {
                System.out.print(number);

                if(number == 0) {
                    number = 1;
                }
                else{
                    number = 0;
                }
            }
            System.out.println();
        }
    }
}
