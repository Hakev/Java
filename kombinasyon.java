import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r;
        System.out.print("Lütfen N Değerini Giriniz : ");
        n = input.nextInt();
        System.out.print("Lütfen R Değerini Giriniz : ");
        r = input.nextInt();

        if (n < r) {
            System.out.print("N değeri, R değerinden yüksek olmalıdır! ");
            n = input.nextInt();
        }
        int fkt1 = 1, fkt2 = 1, fkt3 = 1, fark = n - r;
        for (int a = 1; a < n; a++) {
            fkt1 = fkt1 * a;
        }
        System.out.print("N sayısının faktöriyeli : " + fkt1);
        for (int b = 1; b < r; b++) {
            fkt2 = fkt2 * b;
        }
        System.out.print("R sayısının faktöriyeli :  " + fkt2);
        for (int c = 1; c <= fark; c++) {
            fkt3 = fkt3 * c;
        }
        System.out.print("(N-R)'nin faktöriyeli :" + fkt3);
        int sonuc = fkt2*fkt3;
        int kombinasyon = fkt1/sonuc;
        System.out.println(n + " Sayısının " + r + "'li" + " Kombinasyonu = " + kombinasyon);
    }
}
