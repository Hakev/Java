

import java.util.Scanner;

public class palindromSayilar {

    static boolean isPalindrom(int x) {
        int temp = x, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;                                 //son basamağı elde ettik
            reverseNumber = (reverseNumber * 10) + lastNumber;      //basamakları tersten yazdırma
            temp /= 10;                                             //normal sayıyı son basamaktan kurtarma
        }
        if (reverseNumber == x) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sorgulamak istenilen sayıyı giriniz: ");
        int number = scan.nextInt();
        System.out.println(isPalindrom(number));
    }
}