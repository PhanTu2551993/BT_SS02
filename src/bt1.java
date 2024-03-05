import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bắt đầu dãy > 0 :");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số kết thúc dãy :");
        int end = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if(i%2==0){
                sum += i;
            }
        }
        System.out.println("Tổng số chẵn trong dãy la :" +sum);
    }
}
