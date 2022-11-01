import java.util.Scanner;

public class kdv {

public static void main(String[] args){
    double Fiyat;
    Scanner input = new Scanner(System.in);
    System.out.print("Fiyat bilgisi giriniz : ");
    Fiyat = input.nextDouble();


    boolean oran = Fiyat > 1000;
    System.out.println(oran ? "KDV oranı : " + 0.08 : "KDV oranı :" + 0.18);

    boolean tutar = Fiyat > 1000;
    System.out.println(tutar ? "KDV tutarı : " + Fiyat*0.08 :"KDV Tutarı : " + Fiyat*0.18);

    boolean karar = Fiyat > 1000;
    System.out.println(karar ? "KDV'li Fiyat : " + (Fiyat + Fiyat*0.08) : "KDV'li Fiyat : " + (Fiyat + Fiyat*0.18));
}

}