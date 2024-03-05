import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("chọn hình vẽ :");
            System.out.println("1 :Hình chữ nhật");
            System.out.println("2 :Hình tam giác");
            System.out.println("3 :Tam giác vuông ngược");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1 :
                    for (int i = 1; i <= 3; i++) {
                        System.out.println();
                        for (int j = 1; j <= 10; j++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    System.out.println();
                    break;
                case 2 :
                    for (int i = 1; i < 7; i++) {
                        System.out.println();
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    System.out.println();
                case 3 :
                    for (int i = 7; i >= 1; i--) {
                        System.out.println();
                        for (int j = 0; j < i ; j++) {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    System.out.println();
                default:
                    System.out.println("Nhap sai so");
            }

        }while (true);
    }
}
