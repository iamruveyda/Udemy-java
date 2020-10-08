public class Araba {
    
    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;


    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;  //isimler aynıysa bu objenin özelliğine erişmek için this referansını kullanmamız gerekiyor.
    }

    public int getKapilar() {
        return kapilar;
    }

    public void setKapilar(int kapilar) {
        if (kapilar < 0) {
            System.out.println("Kapı sayısı 0'dan küçük olamaz.");

        }
        else if(kapilar>4){
            System.out.println("Kapı sayısı 4'den büyük olamaz.");
        }
        else {
            this.kapilar = kapilar;

        }
    }

    public int getTekerlekler() {
        return tekerlekler;
    }

    public void setTekerlekler(int tekerlekler) {
        if (tekerlekler < 0) {
            System.out.println("Tekerlekler 0'dan küçük olamaz.");

        }
        else {
            this.tekerlekler = kapilar;

        }
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}


/*
-----Sarmalama / Paketleme (Encapsulation)-----

Dışarından ya da yanlış kullanım sonucu kodu ve veriyi koruyan bir mekanizmadır.
Bir diğer şekliyle iş metot tarafından yapılır fakat metotun içeriği gösterilmez.

Private: Sınıfa özel değişkenlerdir.
Public: Herkese açık olan değişkenlerdir.
Protected: Extends edenlere, türetenlere ve aynı pakette olanlara açık olan değişkenlerdir.
Default: Hiçbir şey yazılmazsa aynı pakettekilerin erişebildiği değişkenlerdir

Kaynak: https://medium.com/gokhanyavas/java-oop-kapsülleme-encapsulation-5-adfa594f7743


*/


/*

1)  Getter Metodu: Get’in kelime anlamı “almak” demektir.
Java’da yaptığı işlem değişkenin değerini almak ve bize return ile geri döndürmektir.

2) Setter Metodu: Set’in kelime anlamı “vermek” demektir.
Setter metodu parametre alır.Bu metot,değişkene değer vermemizi veya değişkenin değerini değiştirmemizi sağlar.

Kaynak: http://yazilimhanem.com/java-encapsulation-kapsulleme/

* */
