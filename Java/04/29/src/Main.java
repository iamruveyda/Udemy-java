/* Kilometreye Göre Toplam Ödenecek Tutar Hesaplama

Bir aracın kilometrede ne kadar yaktığı ve kaç kilometre yol yaptığı bilgilerini alın ve
sürücünün toplam ne kadar ödemesini gerektiğini hesaplayın.


*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Aracınız kilometre kaç kuruş yakıyor? (Örnek : 0,32):");
        double kurus = input.nextDouble();

        System.out.print("Aracınızla kaç kilometre gittiniz ? :");

        int km = input.nextInt();

        System.out.println("Toplam ödemeniz gereken tutar : " + (double)(kurus * km) + " tl dir...");

    }

}
