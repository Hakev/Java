import java.util.Scanner;
public class teksayılarıtoplami {
    public static void main(String[] args){
        int a;
        int b =0;
        Scanner scan= new Scanner(System.in);

        do {

            System.out.print("Lütfen Bir Sayı Giriniz : ");
            a =scan.nextInt();
            if (a%2 == 1){
                b += a;

            }

        }while (a>0);
        System.out.print("Toplam : " + b);


    }
}
