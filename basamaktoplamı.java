import java.util.Scanner;
public class basamaktoplamı {
    public static void main(String[] args ){
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz");
        sayi = input.nextInt();
        int temelsayi;
        int sonuc = 1;
        while (sayi != 0){
            temelsayi = sayi %10;
            sayi /=10;
            sonuc += temelsayi;
        }
        System.out.print(sayi + "Sayısının toplamı" + sonuc);
    }
}


