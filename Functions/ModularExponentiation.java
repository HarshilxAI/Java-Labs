import java.util.Scanner;

public class ModularExponentiation {
    public static long modExp(long a, long m, long p){
        long result = 1;
        a = a % p;
        while(m > 0){
            if((m & 1) == 1){
                result = (result * a) % p;
            }
            a = (a * a) % p;
            m >>= 1;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long m = sc.nextLong();
        long p = sc.nextLong();
        sc.close();
        
        System.out.println(modExp(a, m, p));
    }
}

