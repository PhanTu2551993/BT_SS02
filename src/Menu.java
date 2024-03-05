import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Mời bạn nhập số bất kỳ :");
            int num = Integer.parseInt(scanner.nextLine());
            System.out.println("********Mời ban chon thao tac********");
            int choice = Integer.parseInt((scanner.nextLine()));
            System.out.println("1.Tìm Ước của số vừa nhập");
            System.out.println("2.Tính tổng ước đó");
            System.out.println("3.Tìm các số chia hết cho 3 và 5 trong khoảng từ 1-n");
            System.out.println("4.Thoát");
            switch (choice){
                case 1 :
                    System.out.print("Ước của "+num+" là :  ");
                    for (int i = 1; i <= num; i++) {
                        if (num % i ==0){
                            System.out.print(i+ ",");
                        }
                    }
                    System.out.println();
                    break;
                case 2 :
                    int sum = 0;
                    for (int i = 1; i <= num; i++) {
                        if (num % i ==0){
                            sum = sum + i;
                        }
                    }
                    System.out.println("Tổng các ước của " +num+" bằng : "+sum);
                    break;
                case 3 :
                    System.out.print("Số chia hê cho 3 và 5 trong khoảng là :  ");
                    for (int i = 1; i <= num; i++) {
                        if (i%3==0 && i%5==0){
                            System.out.print( i+ ",");
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Nhap sai yeu cau");
            }
        }while (true);
    }
}
