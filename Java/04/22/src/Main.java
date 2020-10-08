public class Main {

    public static void main(String[] args) {

        // Double : 64 bit - 8 byte
        // Float : 32 bit - 4 byte
        
        // Otomatik Dönüştürme :  int --> float ---> double
        
       double sayi1 = 34.25;
       double sayi2 = 50d;
       double sayi3 = 80.2;

       float a = 34.25f;
       float b = 60f;
       float c = 80.2f;
       float d = (float)8.0;


       System.out.println(d);

       System.out.println("Ortalama: " + (sayi1 + sayi2 + sayi3) / 3 );
       System.out.println("Ortalama2: " + (a + b + c) / 3 );
       
       double x=25.63;
       
       int y=(int)x; //Double'ı integer haline getirme

        System.out.println(y);
    }
}
