import java.util.Scanner;
public class ciftsayi {
    public static void main(String[] args){
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Sayı Giriniz :");
        k = input.nextInt();
        int ortalama = 0;
        int adet =0;

        for (int i = 0; i < k; i++){
            if (i % 3 == 0 && i % 4 == 0){
                ortalama += i;
                adet++;
            }
        }
        int sonuc = ortalama/ (adet - 1);
        System.out.print("Sayı ortalaması : " + sonuc );
    }
}
