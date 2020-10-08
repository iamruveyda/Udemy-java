/*  Basit ATM Programı

 */

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double bakiye = 25000; //Karttaki Para Miktarı


        System.out.printf("1.İşlem : Bakiye Öğrenme\n"
                + "2.İşlem : Para Çekme\n"
                + "3.İşlem : Para Yatırma\n"
                + "Çıkış için q'a basın%n");


        System.out.printf("**************************%n");

        while (true) {

            System.out.print("İşlemi Seçiniz: ");

            String islem = input.nextLine();

            if (islem.equals("q")) // islem==q
            {

                System.out.println("Programdan Çıkılıyor...");
                break;
            }


            else if (islem.equals("1"))
            {
                System.out.printf("Bakiyeniz= %.2f %n",bakiye );
            }


            else if (islem.equals("2")){

                System.out.print("Çekmek istediğiniz tutar : ");
                double tutar = input.nextDouble();

                input.nextLine();

                if (bakiye - tutar < 0) {

                    System.out.printf("Yeterli Bakiyeniz Yok. Mevcut Bakiyeniz= %.2f %n",bakiye );
                }
                else {
                    bakiye -= tutar;
                    System.out.println("Yeni bakiyeniz : " + bakiye);
                }


            }
            else if (islem.equals("3")){
                System.out.print("Yatırmak istediğiniz tutar : ");
                double tutar = input.nextDouble();


                bakiye += tutar;

                System.out.println("Yeni Bakiyeniz  : " + bakiye);

            }
            else {
                System.out.println("Geçersiz İşlem...");
            }


        }


    }
}
