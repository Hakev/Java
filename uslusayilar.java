import java.util.Scanner;
public class uslusayilar {
    public static void main(String[] args){
     int a,b;
     Scanner input = new Scanner(System.in);
     System.out.print("Lütfen Üs Alıncak Sayıyı Giriniz : ");
     a = input.nextInt();
     System.out.print("Lütfen Üs Olacak Sayıyı Giriniz : ");
     b = input.nextInt();
     int total = 1;
     for (  int i = 1; i <= b; i++){
     total *=a;
     }s
     System.out.print("Sonuç : " + total);
    }

}
