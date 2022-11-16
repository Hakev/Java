import java.util.Scanner;
public class sınıfgecme {
    public static void main(String [] args){
    double m, f, t, k, mu;

    Scanner input =new Scanner(System.in);
    System.out.print("Matematik Notunuz : ");
    m = input.nextInt();
    System.out.print("Fizik Notunuz : ");
    f = input.nextInt();
    System.out.print("Türkçe Notunuz : ");
    t = input.nextInt();
    System.out.print("Kimya notunuz : ");
    k = input.nextInt();
    System.out.print("Müzik Notunuz : ");
    mu = input.nextInt();




    if (m>0 && m<100 && f>0 && f<100 && t>0 && t<100 && k>0 && k<100 && mu>0 && mu<100 ){
        double toplam =((m+f+t+k+mu)/5);
        System.out.print("Ortalamanız : " + toplam);
    if (toplam>=55);
    System.out.print("Sınıfı Geçtiniz");
    }else{
        System.out.print("Kaldınız");
    }

    }
}
