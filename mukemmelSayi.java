import java.util.Scanner;
public class mukemmelSayi {
    public static void main(String [] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz :");
        int number = input.nextInt();
        int total = 0;
        for (int i = 1; i<number;i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total==number){
            System.out.println("Mükemmel Sayıdır");
        }else
            System.out.println("Mükemmel Sayı Değildir ");
    }
}
