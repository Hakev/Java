import java.util.Scanner;

public class Ucgenhesaplama {
    public static void main(String[] args) {

        float a, b, c;


        Scanner girdi = new Scanner(System.in);

        System.out.print("a kenarını giriniz : " );
        a = girdi.nextFloat();

        System.out.print("b Kenarını giriniz : ");
        b = girdi.nextFloat();

        System.out.print("c kenarını giriniz : ");
        c = girdi.nextFloat();

        float toplam = a + b + c;
        float u = toplam / 2;

        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Alan : " + alan);

        /*HER KENARI BELİRTMEK İÇİN FARKLI GİRDİLER OLUŞTURDUM. GİRDİLERİN ONDALIKLI SAYI OLMASI
        İHTİMALİNE KARŞI FLOAT VERİ TİPİNİ KULLANDIM. SONUCUN BÜYÜK SAYILAR OLMASI İHTİMALİNE KARŞIDA
        DOUBLE VERİ TİPİNİ KULLANDIM.

        EĞER KENARLARIN BELİRLENMESİNE GEREK DUYMUYORSAK AŞAĞIDAKİ GİBİ KOD GİREBİLİRİZ

         Scanner scan = new Scanner(System.in);
        System.out.println("Kenarları Giriniz :");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
         */





    }


}
