import java.util.Scanner;
public class dortvebesinkatları {
        public static void main(String[] args){
            double a;
            Scanner scan= new Scanner(System.in);

            System.out.print("Lütfen Bir Sayı Giriniz :");
            a = scan.nextInt();

            for (int b=1; b<=a; b*=4){
                System.out.println(b);
            }
            for (int c =1; c<=a; c*=5){
                System.out.println(c);

            }
        }
}
