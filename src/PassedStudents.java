import java.util.Scanner;

public class PassedStudents {
    public static void main(String[] args) {
        int numOfStudent;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng sinh viên: ");
            numOfStudent=sc.nextInt();
            if (numOfStudent<1 || numOfStudent>30)
                System.out.println("Invalid.");
        }
        while (numOfStudent<1 && numOfStudent>30);
        double[] mark;
        mark =new double[numOfStudent];
        for (int i=0;i<numOfStudent;i++) {
            System.out.println("Nhập điểm của sinh viên thứ "+(i+1)+" :");
            mark[i]=sc.nextDouble();
        }
        int count=0;
        System.out.println("Danh sách điểm của sinh viên: ");
        for (int j=0;j<numOfStudent;j++) {
            System.out.print(mark[j]+" \t");
            if (mark[j]>=5 && mark[j]<=10)
                count++;
        }
        System.out.println();
        System.out.println("Số lượng sinh viên qua môn = "+count);
    }
}
