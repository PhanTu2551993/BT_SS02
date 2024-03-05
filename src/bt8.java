import java.util.Scanner;

public class bt8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap canh thu 1");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap canh thu 2");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap canh thu 3");
            int c = Integer.parseInt(scanner.nextLine());

            if (a>0 && b>0 && c>0 && (a+b>c && a+c>b && b+c>a)){
                double P = (a + b + c) / 2;
                double S = Math.sqrt(P * (P - a) * (P - b) * (P - c));
                System.out.printf("Chu vi tam giac = %.2f và diện tích tam giac = %.2f ", P * 2.0, S);
                break;
            }else {
                System.out.println("Nhập sai cạnh hãy nập lại");
            }
        }
    }
}
