import java.util.Scanner;
public class ChuyenDoiNhietDo {
    public static double celciusToFahrenheit(double celcius) {
        double fahrenheit=(9.0/5)*celcius+32;
        return fahrenheit;
    }
    public static double fahrenheitToCelcius(double fahrenheit) {
        double celcius=(5.0/9)*(fahrenheit-32);
        return celcius;
    }

    public static void main(String[] args) {
        Scanner input_value=new Scanner(System.in);
        double fahrenheit;
        double celcius;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celcius");
            System.out.println("2. Celcuis to Fahrenheit");
            System.out.println("0. Exit");
            choice=input_value.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập nhiệt độ Fahrenheit:");
                    fahrenheit=input_value.nextDouble();
                    System.out.println("Fahrenheit to Celcius: "+fahrenheitToCelcius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Nhập nhiệt độ Cencius:");
                    celcius=input_value.nextDouble();
                    System.out.println("Celcius to Fahrenheit: "+celciusToFahrenheit(celcius));
                    break;
                case 0:
                    System.exit(0);
            }
        }
        while (choice!=0);
    }
}
