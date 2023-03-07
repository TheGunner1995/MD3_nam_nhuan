import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.println("Nhập năm bạn muốn tính : ");
        int Year = year.nextInt();
        if (Year % 4 == 0){
            if (Year % 100 == 0){
                if (Year % 400 == 0){
                    System.out.println("năm "+ Year + "là năm nhuận");
                }else{
                    System.out.println("năm "+ Year + " không là năm nhuận");
                }
            }else {
                System.out.println("năm "+ Year + " không là năm nhuận");
            }
        }else {
            System.out.println("năm "+ Year + " không là năm nhuận");
        }
    }
}