import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ 1");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số thứ 2");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số thứ 3");
        int num3 = Integer.parseInt(scanner.nextLine());
        int n = 1;
        while (true){
            if (n%num1==0 && n%num2==0 && n%num3==0){
                System.out.printf("So nguyen duong nho nhat chia het cho %d,%d,%d la : %d",num1,num2,num3,n);
                break;
            }
                n++;
        }
    }
}
