import java.util.Scanner;
public class havadurumu {
    public static void main(String [] args){
        int sicaklik;
            Scanner input = new Scanner(System.in);
            System.out.print("Lütfen sıcaklık değeri giriniz : ");
            sicaklik = input.nextInt();

            if (sicaklik <= 5){
                System.out.print("Kayak Yapabilirsiniz ");
            }
            else if (sicaklik > 5 && sicaklik < 15) {
                System.out.print("Sinemaya Gidebilirsiniz ");
            } else if (sicaklik > 10 && sicaklik < 25) {
                System.out.print("Pikniğe Gidebilirsiniz ");
            }
            else {
                System.out.print("Yüzmeye Gidebilirsiniz ");
            }
    }

}
