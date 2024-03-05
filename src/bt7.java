import java.util.Scanner;

public class bt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("********Mời ban chon thao tac********");
            System.out.println("1.Tính chu vi và diện tích hình chữ nhật");
            System.out.println("2.Tính chu vi và diện tích hình tam giác");
            System.out.println("3.Tính chu vi và diện tích hình tròn");
            System.out.println("4.Thoát");
            int choice = Integer.parseInt((scanner.nextLine()));
            switch (choice){
                case 1 :
                    System.out.println("Nhap chieu dai");
                    int a = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhap chieu rong");
                    int b = Integer.parseInt(scanner.nextLine());
                    int chuViHCN = (a+b)*2;
                    int dienTichHCN = a*b;
                    System.out.println("Chu vi HCN = "+chuViHCN+" va dien tich HCN = "+dienTichHCN);
                    break;
                case 2 :
                    System.out.println("Nhap canh thu 1");
                    int x = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhap canh thu 2");
                    int y = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhap canh thu 3");
                    int z = Integer.parseInt(scanner.nextLine());
                    double P = (x+y+z)/2;
                    double S = Math.sqrt(P*(P-x)*(P-y)*(P-z));
                    System.out.printf("Chu vi tam giac = %.2f và diện tích tam giac = %.2f ",P*2,S);
                    break;
                case 3 :
                    System.out.println("Nhap ban kinh hinh tron");
                    int R = Integer.parseInt(scanner.nextLine());
                    final double PI = 3.14;
                    double chuViHinhTron = 2*PI*R;
                    double dienTichHinhTron = PI*R*R;
                    System.out.printf("Chu vi hinh tròn = %.2f và Diện tích hình tròn = %.2f",chuViHinhTron,dienTichHinhTron);
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
