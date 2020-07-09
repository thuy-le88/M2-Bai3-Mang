import java.util.Scanner;

public class SumOfDiagonalLine {
    public static void main(String[] args) {
        int row;
        int col;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row: ");
        row = sc.nextInt();
        System.out.println("Enter col: ");
        col = sc.nextInt();
        double[][] array;
        array = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter element at row [" + i + "]" + "[" + j + "]");
                array[i][j] = sc.nextDouble();
            }
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        System.out.println();
        for (int m = 0; m < row; m++) {
            for (int n = 0; n < col; n++) {
                System.out.print(array[m][n] + "\t");
            }
            System.out.println();
        }
        double sum_LeftToRight=0;
        for (int i=0,j=0;i<col;i++,j++) {
            sum_LeftToRight+=array[i][j];
        }
        System.out.println("Sum of Diagonal Line from Left to Right ="+sum_LeftToRight);
        double sum_RightToLeft=0;
        for (int i=0,j=col-1;i<row;i++,j--) {
            sum_RightToLeft+=array[i][j];
        }
        System.out.println("Sum of Diagonal Line form Right to Left ="+sum_RightToLeft);
    }
}
