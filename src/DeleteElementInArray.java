import java.util.Scanner;
public class DeleteElementInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        size=sc.nextInt();
        array = new int [size];
        int i=0;
        while (i<array.length) {
            System.out.println("Enter a element "+(i+1)+" : ");
            array[i]=sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        int x;
        System.out.print("Enter a number to be deleted if have: ");
        x=sc.nextInt();
        int c;
        for (c = i = 0; i < size; i++) {
            if (array[i] != x) {
                array[c] = array[i];
                c++;
            }
        }

        size = c;
        System.out.printf("%-20s%s", "New array: ", "");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
