public class HollowDiamond {

    static void hollowDiamond(int n) {
        int totalRows = 2*n-1;
        for(int row = 1; row <= totalRows; row++) {
            int currentRow = (row <= n) ? row : totalRows - row + 1;

            for(int space = 1; space <= n - currentRow; space++) {
                System.out.print(" ");
            }

            for(int star = 1; star <= 2 * currentRow - 1; star++) {
                if(star == 1 || star == 2*currentRow-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowDiamond(5);
    }
}
