import java.util.Scanner;
public class FindMaxInMultiArray {
    public static void main(String[] args) {
        int row;
        int col;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row: ");
        row=sc.nextInt();
        System.out.println("Enter col: ");
        col=sc.nextInt();
        int[][] array;
        array = new int[row][col];
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                System.out.println("Enter element at row ["+i+"]"+"["+j+"]");
                array[i][j]=sc.nextInt();
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
        int min=minValue(array);
        System.out.println("Smallest element in array is "+min);
    }
    public static int minValue(int[][] array){
        int min=array[0][0];
        for (int i=0;i<array.length;i++) {
            for (int j=0;j<array[i].length;j++) {
                if (min>array[i][j])
                    min=array[i][j];
            }
        }
        return min;
    }
}
