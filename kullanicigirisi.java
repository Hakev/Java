import java.util.Scanner;
public class kullanicigirisi {
    public static void main(String[] args) {

        String used, password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        used = inp.nextLine();
        System.out.print("Şifre : ");
        password = inp.nextLine();

        if (used.equals("Hakev") && password.equals("hakev123")) {
            System.out.print("Giriş İşlemi Başarılı");
        } else {
            System.out.print("Girdiğiniz Bilgiler Yanlış");


            String newPsw;

            System.out.print("\nŞifrenizi Değiştirmek İster misiniz? \n1-Evet/2-Hayır : ");
            int select = Integer.parseInt(inp.nextLine());

            switch (select) {
                case 1:
                    Scanner inp2 = new Scanner(System.in);
                    System.out.print("Yeni Şifre Giriniz : ");
                    newPsw = inp2.nextLine();
                    if (newPsw.equals("hakev123")){
                        System.out.print("Şifreniz Eski Şifre İle Aynı Olamaz");
                    } else {
                        System.out.print("Şifreniz Başarıyla Oluşturuldu");
                    }
                    break;
                case 2:
                    System.out.print("Çıkış Yapıldı");
                    break;

            }
        }
    }
    }
