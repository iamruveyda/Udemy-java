/* 06Ex: Kullanıcı Giriş Kontrolü

 */

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int giris_hakki = 3;

        //Sistemde kayıtlıymış gibi kullanıcı adı ve şifre değişkenleri yapıyoruz.
        String sistem_kullanici_adi = "iamruveyda";
        String sistem_parola = "12345";


        while (true) {

            System.out.print("Kullanıcı Adı : ");
            String kullanici = input.nextLine();

            System.out.print("Parola : ");
            String parola = input.nextLine();

            if (kullanici.equals(sistem_kullanici_adi) && parola.equals(sistem_parola)) {
                System.out.println("Hoşgeldiniz, " + kullanici);
                break;
            }

            else if (kullanici.equals(sistem_kullanici_adi) && !parola.equals(sistem_parola)) {

                System.out.println("Parolanız Yanlış");
                giris_hakki -= 1;

                System.out.println("Giriş Hakkı : " + giris_hakki);
            }

            else if (!kullanici.equals(sistem_kullanici_adi) && parola.equals(sistem_parola)) {

                System.out.println("Kullanıcı Adınız Yanlış");
                giris_hakki -= 1;
                System.out.println("Giriş Hakkı : " + giris_hakki);
            }

            else {
                System.out.println("Kullanıcı Adınız ve Parolanız Yanlış");

                giris_hakki -= 1;
                System.out.println("Giriş Hakkı : " + giris_hakki);
            }

            if (giris_hakki == 0){

                System.out.println("Giriş hakkınız bitti");
                break;
            }

        }
    }
}
