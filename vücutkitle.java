import java.util.Scanner;
public class vücutkitle {
    public static void main(String[] args){
        double a,b;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu (metre cinsinden) Giriniz : ");
        a = inp.nextFloat();
        System.out.print("Lütfen Kilonuzu (Kg cinsinden) Giriniz : ");
        b = inp.nextFloat();

        double kıtle = (b/(a*a));

        System.out.println("Vücut Kitle İndeksiniz : " + kıtle);

        
    }
}
