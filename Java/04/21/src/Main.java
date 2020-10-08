public class Main {
    
    public static void main(String[] args) {
        // byte --> short --> int --> long

        System.out.println(Byte.MAX_VALUE);
        
        System.out.println(Short.MAX_VALUE);
        
        System.out.println(Integer.MAX_VALUE);
        
        System.out.println(Integer.MIN_VALUE);
        
        System.out.println(Long.MAX_VALUE);
                
        short i = 100;
        byte j = 2;
        int k = 4;
        
        long d = i + j + k;

        System.out.println(d);
  
    }
}