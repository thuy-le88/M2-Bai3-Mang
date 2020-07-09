import java.util.Scanner;

public class CharInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập chuỗi kí tự: ");
        String str=sc.nextLine();
        System.out.println("Chuỗi cần kiểm tra là: "+str);
        //System.out.println("Nhật kí tự cần kiểm tra: ");
        char checkChar='N';
        boolean isIn=false;
        int count=0;
        for (int i=0;i<str.length();i++) {
            if (checkChar==str.charAt(i))
                isIn=true;
        }
        if (isIn) {
            System.out.println("Char "+checkChar+" is found in String: "+str);
        }
        else {
            System.out.println("Not found.");
        }
    }
}
