import java.util.Scanner;
public class cinburcu {
    public static void main(String[] args){
        double year;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Doğum Yılınızı Giriniz : ");
        year = input.nextDouble();
        double sonuc = (year%12);

        if (sonuc == 0){
            System.out.print("Çin Zodyağı Burcunuz: Maymun ");
        } else if (sonuc == 1) {
            System.out.print("Çin Zodyağı Burcunuz: Horoz ");
        } else if (sonuc == 2) {
            System.out.print("Çin Zodyağı Burcunuz: Köpek ");
        } else if (sonuc == 3) {
            System.out.print("Çin Zodyağı Burcunuz: Domuz ");
        } else if (sonuc == 4) {
            System.out.print("Çin Zodyağı Burcunuz: Fare ");
        } else if (sonuc == 5) {
            System.out.print("Çin Zodyağı Burcunuz: Öküz ");
        } else if (sonuc == 6) {
            System.out.print("Çin Zodyağı Burcunuz: Kaplan ");
        } else if (sonuc == 7) {
            System.out.print("Çin Zodyağı Burcunuz: Tavşan ");    
        } else if (sonuc == 8) {
            System.out.print("Çin Zodyağı Burcunuz: Ejderha ");
        } else if (sonuc == 9) {
            System.out.print("Çin Zodyağı Burcunuz: Yılan ");
        } else if (sonuc == 10) {
            System.out.print("Çin Zodyağı Burcunuz: At ");    
        } else if (sonuc == 11) {
            System.out.print("Çin Zodyağı Burcunuz: Koyun ");
        }else {
            System.out.print("Perfect");
        }

    }
}
