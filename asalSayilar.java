public class asalSayilar {
    public static void main(String[] args) {
        System.out.println("1 ile 100 Asal Sayılar ");
        for (int i = 1; i < 100; i++) {
            int sayac = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sayac++;
                }
            }
            if (sayac == 2) {
                System.out.println(i + "-");
            }
        }
    }
}
