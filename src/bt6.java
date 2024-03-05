import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("********Mời ban chon thao tac********");
            System.out.println("1.Kiểm tra tính chẵn lẻ số ừa nhập");
            System.out.println("2.Kiểm tra số nguyên tố");
            System.out.println("3.Tìm các số chia hết cho 3 không");
            System.out.println("4.Thoát");
            int choice = Integer.parseInt((scanner.nextLine()));
            System.out.println("Mời bạn nhập số bất kỳ :");
            int num = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1 :
                        if (num % 2 ==0){
                            System.out.print(num+ " Là số chẵn");
                        }else {
                            System.out.println(num+ " Là số lẻ");
                    }
                    System.out.println();
                    break;
                case 2 :
                        boolean check = true;
                        for (int i = 2; i <= Math.sqrt(num); i++) {
                            if (num%i == 0){
                                check = false;
                                System.out.println(num+" Không phải là so nguyen to ");
                                break;
                            }

                        }if (check){
                            System.out.println(num+" Là số nguyên tố");
                        }
                    break;
                case 3 :
                        if (num%3==0){
                            System.out.println( num+ " Chia hết cho 3");
                        }else {
                            System.out.println( num +" Không chia hết cho 3");
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
