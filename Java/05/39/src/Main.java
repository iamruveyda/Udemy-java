/*  Beden Kitle Indeksi Hesaplama

Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle indeksini bulun.
Beden Kitle İndeksi : Kilo / Boy(m) * Boy(m)

- If-Else Kullanımı
    
 */


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kilonuz:");
        double kilo = scanner.nextDouble();

        System.out.print("Boy (Örnek : 1,72): ");
        double boy = scanner.nextDouble();

        double bki = (kilo / (boy  * boy));

        System.out.println("Beden Kitle Indeksiniz : " + bki);

        if (bki < 18.5) {
            System.out.println("Zayıf");
        }
        else if (bki >= 18.5 && bki < 25) {
            System.out.println("Normal");
        }
        else if (bki >= 25 && bki < 30) {
            System.out.println("Fazla Kilolu");
        }
        else {
            System.out.println("Obez");
        }
    }

}

 /*
            BKİ 18.5'un altındaysa -------> Zayıf

            BKİ 18.5 ile 25 arasındaysa ------> Normal

            BKİ 25 ile 30 arasındaysa --------> Fazla Kilolu

            BKİ 30'un üstündeyse -------------> Obez

        */