import java.util.Scanner;

public class FindMin {
    public static int minValue(int[] array){
        int min=array[0];
        for (int i=1;i<array.length;i++) {
            if (min>array[i])
                min=array[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        size=sc.nextInt();
        int[] array;
        array = new int[size];
        for (int i=0;i<size;i++) {
            System.out.println("Enter element "+i);
            array[i]=sc.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j=0;j<size;j++) {
            System.out.print(array[j]+"\t");
        }
        System.out.println();
        int min=minValue(array);
        System.out.println("The smallest of array is "+min);
    }
}
