public class MirrorNumberPyramid {
    static void mirrorNumberPyramid(int n) {
        for(int row = 1; row <= n; row++) {
            for(int space = 1; space <= n-row; space++) {
                System.out.print(" ");
            }

            // increasing
            for(int col = 1; col <= row; col++) {
                System.out.print(col);
            }

            // decreasing
            for(int col = row-1; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        mirrorNumberPyramid(5);
    }
}
