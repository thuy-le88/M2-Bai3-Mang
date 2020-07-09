import java.util.Scanner;
public class SumOfColumn {
    public static void main(String[] args) {
        int row;
        int col;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row: ");
        row=sc.nextInt();
        System.out.println("Enter col: ");
        col=sc.nextInt();
        double[][] array;
        array = new double[row][col];
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                System.out.println("Enter element at row ["+i+"]"+"["+j+"]");
                array[i][j]=sc.nextDouble();
            }
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        System.out.println();
        for (int m=0;m<row;m++) {
            for (int n=0;n<col;n++) {
                System.out.print(array[m][n]+"\t");
            }
            System.out.println();
        }
        System.out.println("Enter column no. which would be summarized:");
        int column=sc.nextInt();
        int sum=0;
        for (int k=0;k<row;k++) {
            sum+=array[k][column];
        }
        System.out.println("Sum of column no."+(column+1)+" = "+sum);
    }
}
