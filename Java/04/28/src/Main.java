
/*  Beden Kitle Indeksi Hesaplama

Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle indeksini bulun.
Beden Kitle İndeksi : Kilo / Boy(m) * Boy(m)

 */

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu Girin:");
        double kilo = input.nextDouble();

        System.out.print("Boyunuzu Girin (Örnek : 1,72):");
        double boy = input.nextDouble();

        double bki = kilo / (boy * boy);

        System.out.println("Beden Kitle Indeksiniz : " + bki);



    }
}
