import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so so nguyen to : ");
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int num = 2;
        while (count < n){
            boolean check = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num%i == 0){
                        check = false;
                        break;
                    }

                }if (check){
                    System.out.print(num+",");
                    count++;
                }
                num++;
            }

            }
        }


