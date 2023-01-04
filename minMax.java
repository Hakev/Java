import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0, adet, i = 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Lütfen Sayı Adedini Giriniz");
        adet = input.nextInt();
        do {
            System.out.println(i + ". sayıyı giriniz: ");
            number = input.nextInt();
            if (number > max) {
                max = number;

            }
            if (number < min) {
                min = number;
            }
            i++;
        } while (adet >= i);
        System.out.println("En Büyük Sayı : " + max);
        System.out.println("En Küçük Sayı : " + min);


    }
}
