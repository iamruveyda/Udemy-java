public class Main {

    public static void main(String[] args) {
        // Char Veri Tipi : Karakterleri göstermek için kullanılır. 2 byte yer kaplar. 2^16 tane karakter simgelenebilir.
        // Boolean Veri Tipi : Koşul Durumlarında kullanılır. true veya false değeri alır.

        char x = 'A';
        char z = 65; // 'A' harfininin ASCII kodu 65

        System.out.println(x);
        System.out.println(z);

        /*UNICODE kodları ile adımı yazıyorum*/
        char r = '\u0052'; 
        char u = '\u00DC';
        char v = '\u0056';
        char e = '\u0045';
        char y = '\u0059';
        char d = '\u0044';
        char a = '\u0041';
        
        System.out.printf("%c%c%c%c%c%c%c %n", r,u,v,e,y,d,a);

        boolean aa = true;
        boolean bb = false;
        
        System.out.println(aa);
        System.out.println(bb);
    }
}
