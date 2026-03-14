public class RightAngledTriangleNumberPattern {

    static void printRightAngledTriangleNumberPattern(int n) {
        int num = 0;
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col<= row; col++) {
                num = num + 1;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printRightAngledTriangleNumberPattern(5);
    }
}
