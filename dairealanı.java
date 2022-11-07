import java.util.Scanner;
public class dairealanı {
    public static void main(String[] args) {
    int r, a;
    double pi =3.44;
    Scanner inp = new Scanner(System.in);
    System.out.print("Dairenin Yarı Çapını Giriniz : ");
    r = inp.nextInt();
    System.out.print("Merkez Açı Ölçüsünü Giriniz (0-360) : ");
    a = inp.nextInt();
    double alan = (pi * (r*r) * a) / 360;


    System.out.println("Dairenin alanı : " + alan);

    }

}
