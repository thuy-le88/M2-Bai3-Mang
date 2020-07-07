import java.util.Scanner;
public class FindMax {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input_value=new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        size=input_value.nextInt();
        array = new int[size];
        int i=0;
        for (;i<array.length;i++) {
            System.out.println("Nhập phần tử vị trí thứ "+(i+1)+" :");
            array[i]=input_value.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j=0;j<array.length;j++) {
            System.out.print(array[j]+"\t");
        }
        int max=array[0];
        int index=1;
        for (int j=1;j<array.length;j++) {
            if (max<array[j]) {
                max=array[j];
                index=j+1;
            }
        }
        System.out.println("Giá trị lớn nhất của mảng là: "+max+" ở vị trí thứ "+index);
    }
}
