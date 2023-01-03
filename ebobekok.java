import java.util.Scanner;

public class ebobekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen İlk Sayıyı Giriniz : ");
        int n1 = input.nextInt();
        System.out.print("Lütfen İkinci Sayıyı Giriniz : ");
        int n2 = input.nextInt();
        int i = 1, k = 1, ebob = 1, ekok = 1;

        if (n1 < n2) {
            while (i <= n1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }

        } else {
            while (i <= n2) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }

        }
        System.out.println("Ebob : " + ebob);

        while (n1 * n2 >= k) {
            if (k % n1 == 0 && k % n2 == 0) {
                ekok = k;
                break;
            }
            k++;
        }
        System.out.println("Ekok: " + ekok);
    }
}
