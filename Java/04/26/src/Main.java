
import java.util.Scanner; //Scanner Sınıfı


public class Main {
    public static void main(String[] args) {
      
        
        Scanner input = new Scanner(System.in); //Kullanıcıdan string değer alabilmek için Scanner sınıfını kullandık

        System.out.print("Lütfen mesaj giriniz: ");
        String mesaj = input.nextLine(); //String değeri burda alıyoruz
        System.out.println("Mesajınız: "+mesaj);
        
        
        System.out.print("Lütfen ilk sayiyi giriniz: ");
        int sayi1 = input.nextInt(); //int değer alıyoruz

        System.out.print("Lütfen ikinci sayiyi giriniz: ");
        int sayi2 = input.nextInt(); //int değer alıyoruz


        System.out.println("Toplam: "+(sayi1+sayi2));
        
        
        
        int yas1 = input.nextInt();
        int yas2 = input.nextInt();
        int yas3 = input.nextInt();
        
        System.out.println("yas1 : " + yas1 + " yas2: " + yas2 + " yas3: " + yas3 );
        
        /*int yas = scanner.nextInt();
        scanner.nextLine(); // Dummy
        
        String isim = scanner.nextLine();
        
        System.out.println("Yaş: " + yas);
        System.out.println("İsim: " + isim);*/
        
        Scanner reader = new Scanner(System.in,"ISO-8859-9"); //Java Scanner Türkçe Karakter Okuma
        
          System.out.print("Bir Yazı Girin: ");
       
        String yazi = reader.nextLine();
        System.out.println("Yazdığınız Yazı: " + yazi);
        
    }

    
}
/*

nextLine() -> String
nextInt() -> Integer
nextByte() -> Byte
nextFloat -> Float
nextDouble -> Double

*/